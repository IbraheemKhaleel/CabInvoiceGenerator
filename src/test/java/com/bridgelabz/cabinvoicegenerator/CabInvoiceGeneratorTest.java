package com.bridgelabz.cabinvoicegenerator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

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
    public void givenUserID_WhenChecked_ShouldReturnRespectiveUserInvoice()
    {
        Person person =new Person("jake");
        person.add(6 , 4) ;
        person.add(8 , 7) ;
        List<Rides> userRideList = cabInvoiceGenerator.getListOfRides(person) ;
        InvoiceSummary invoiceSummary = cabInvoiceGenerator.calculateMultipleRides(userRideList) ;
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 6*10+4+8*10+7) ;
        Assert.assertEquals(expectedInvoiceSummary, invoiceSummary ) ;
    }
}
