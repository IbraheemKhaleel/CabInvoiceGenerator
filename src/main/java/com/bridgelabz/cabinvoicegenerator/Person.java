package com.bridgelabz.cabinvoicegenerator;

import java.util.ArrayList;
import java.util.List;

public class Person
{
    private final String name;
    private final ArrayList personList;

    public Person(String name)
    {
        this.name = name ;
        this.personList = new ArrayList<>();
    }

    /**
     * @param distance distance travelled by customer in kilometers
     *                 Adding both distance and time inputs in the list
     * @param time duration of the travel in minutes
     */
    public void add(double distance, int time)
    {
        this.personList.add(new Rides(distance , time )) ;
    }

    public List<Rides> getPersonList() {
        return this.personList ;
    }
}
