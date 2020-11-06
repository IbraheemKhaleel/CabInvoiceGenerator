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
        Assert.assertEquals(106 ,fare,0.5);
    }
}
