package com.bridgelabz.cabinvoicegenerator;

import java.lang.reflect.Array;
import java.util.*;

public class RideRepository
{
    Map<String, ArrayList<Rides>> userRides = null ;
    public RideRepository()
    {
        this.userRides = new HashMap<>() ;
    }

    /**
     * @param userName name of given customer
     *                 Adding user name along with ride details in a hashmap
     * @param ride array of travel details and costs
     */
    public void addRides(String userName, Rides[] ride)
    {
        ArrayList<Rides> rideList = this.userRides.get(userName) ;
        if(rideList == null )
            this.userRides.put(userName , new ArrayList<>(Arrays.asList(ride))) ;
    }

    /**
     * @param userName
     * @return  Ride details o given user
     */
    public Rides[] getRide(String userName)
    {
        return userRides.get(userName).toArray(new Rides[0]) ;
    }
}
