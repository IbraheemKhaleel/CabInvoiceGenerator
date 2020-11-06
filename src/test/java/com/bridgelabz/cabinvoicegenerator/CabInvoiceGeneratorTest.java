package com.bridgelabz.cabinvoicegenerator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CabInvoiceGeneratorTest {
    CabInvoiceGenerator cabInvoiceGenerator = null ;

    @Before
    public void setUp() throws Exception
    {
        cabInvoiceGenerator = new CabInvoiceGenerator();
    }

    @Test
    public void givenDistanceTime_WhenCalculated_ShouldReturnTotalFare()
    {
        double distance = 10.05 ;
        int time = 6 ;
        double fare = cabInvoiceGenerator.calculateTotalFare(distance, time) ;
        Assert.assertEquals(106 , fare,0.5);
    }

    @Test
    public void givenMultipleRides_When_Calculated_ShouldReturnInvoiceSummary()
    {
        Rides[] ride = {new Rides(2.0 , 3),
                        new Rides(3.0, 4)} ;
        InvoiceSummary invoiceSummary = cabInvoiceGenerator.calculateMultipleRides(ride) ;
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 2*10+3+3*10+4) ;
        Assert.assertEquals(expectedInvoiceSummary, invoiceSummary ) ;
    }
}
