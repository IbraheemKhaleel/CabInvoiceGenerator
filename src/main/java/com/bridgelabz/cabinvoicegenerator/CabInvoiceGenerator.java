package com.bridgelabz.cabinvoicegenerator;

public class CabInvoiceGenerator {
    public static final int RATE_PER_KILOMETER = 10 ;
    public static final int MINIMUM_FARE = 5 ;

    /**
     * @param distance Calculating total fare depends on distance and time.
     *                 if it is less than 5 , then total fare will be will be minimum fare .
     * @param time
     * @return
     */
    public double calculateTotalFare(double distance , int time )
    {
        double totalFare = distance*RATE_PER_KILOMETER + time ;
        if (totalFare < 5)
            return MINIMUM_FARE ;
        return totalFare;
    }
}
