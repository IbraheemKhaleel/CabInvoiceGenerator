package com.bridgelabz.cabinvoicegenerator;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {
    @Test
    public void givenDistanceTime_WhenCalculated_ShouldReturnTotalFare()
    {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double distance = 10.05 ;
        int time = 6 ;
        double fare = cabInvoiceGenerator.calculateTotalFare(distance, time) ;
        Assert.assertEquals(106 , fare,0.5);
    }

    @Test
    public void givenMultipleRides_When_Calculated_ShouldReturnTotalFare()
    {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        Rides[] ride = {new Rides(2.0 , 3),
                        new Rides(3.0, 4),
                        new Rides(4.0, 5)} ;
        double fare = cabInvoiceGenerator.calculateMultipleRides(ride) ;
        Assert.assertEquals(2*10 + 3 + 3*10 + 4 + 4*10 + 5, fare, 0.0 ) ;
    }
}
