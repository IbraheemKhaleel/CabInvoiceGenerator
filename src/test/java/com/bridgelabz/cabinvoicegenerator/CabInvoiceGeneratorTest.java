package com.bridgelabz.cabinvoicegenerator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CabInvoiceGeneratorTest {
    InvoiceService invoiceService = null ;

    @Before
    public void setUp() throws Exception
    {
        invoiceService = new InvoiceService();
    }

    @Test
    public void givenDistanceTime_WhenCalculated_ShouldReturnTotalFare()
    {
        double distance = 10.05 ;
        int time = 6 ;
        double fare = invoiceService.calculateTotalFare(distance, time) ;
        Assert.assertEquals(106 , fare,1);
    }

    @Test
    public void givenMultipleRides_When_Calculated_ShouldReturnInvoiceSummary()
    {
        Rides[] ride = {new Rides(2.0 , 3),
                new Rides(3.0, 4)} ;
        InvoiceSummary invoiceSummary = invoiceService.calculateMultipleRides(ride) ;
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 2*10+3+3*10+4) ;
        Assert.assertEquals(expectedInvoiceSummary, invoiceSummary ) ;
    }

    @Test
    public void givenUserName_When_Calculated_ShouldReturnUserInvoiceSummary()
    {
        String userName = "Gyllenhall" ;
        Rides[] ride = {new Rides(2.0 , 3),
                        new Rides(3.0, 4)} ;
        invoiceService.addRide(userName, ride);
        InvoiceSummary invoiceSummary = invoiceService.getInvoiceSummary(userName) ;
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 2*10+3+3*10+4) ;
        Assert.assertEquals(expectedInvoiceSummary, invoiceSummary ) ;
    }
}
