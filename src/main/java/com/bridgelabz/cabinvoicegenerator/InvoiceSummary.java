package com.bridgelabz.cabinvoicegenerator;

public class InvoiceSummary {
    private final double totalFare;
    private final double numOfRides;
    private final double averageFare;

    /**
     * @param numOfRides number of rides taken by customer
     * @param totalFare sum of all fares the customer has to pay.
     */
    public InvoiceSummary(double numOfRides ,double totalFare )
    {
        this.totalFare = totalFare ;
        this.numOfRides = numOfRides ;
        this.averageFare = this.totalFare/this.numOfRides ; ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return Double.compare(that.totalFare, totalFare) == 0 &&
                Double.compare(that.numOfRides, numOfRides) == 0 &&
                Double.compare(that.averageFare, averageFare) == 0;
    }
}
