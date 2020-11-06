package com.bridgelabz.cabinvoicegenerator;

public class Rides {
    public final double distance;
    public final int time;

    /**
     * @param distance distance travelled by customer in kilometers
     * Creating constructor to provide time and distance for multiple rides
     * @param time duration of journey in cab in minutes
     */
    public Rides(double distance, int time)
    {
        this.distance = distance ;
        this.time = time ;
    }
}
