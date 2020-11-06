package com.bridgelabz.cabinvoicegenerator;

public class CabInvoiceGenerator {
    public static final int RATE_PER_KILOMETER = 10 ;
    public static final int MINIMUM_FARE = 5 ;

    /**
     * @param distance distance travelled by customer in kilo meters
     * Calculating total fare depends on distance and time.
     *                 if it is less than 5 , then total fare will be will be minimum fare .
     * @param time duration time taken for the ride in minutes
     * @return total fare by calculating both distance and time
     */
    public double calculateTotalFare(double distance , int time )
    {
        double totalFare = distance*RATE_PER_KILOMETER + time ;
        if (totalFare < 5)
            return MINIMUM_FARE ;
        return totalFare;
    }

    /**
     * @param ride It has array of distance and time inputs for cab invoice
     * Calculating total fare for multiple cab rides by calling calculateTotalFare method.
     * @return total fare calculated by array of distance and time inputs
     */
    public double calculateMultipleRides(Rides[] ride) {
        double totalFare = 0;
        for (Rides rides : ride)
        {
            totalFare += calculateTotalFare(rides.distance,rides.time);
        }
        return totalFare;
    }
}
