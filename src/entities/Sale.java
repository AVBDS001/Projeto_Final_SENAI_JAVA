package entities;

public class Sale {
    private Double totalValue;
    private Integer saleID;

    public Sale(Double totalValue, Integer saleID) {
        this.totalValue = totalValue;
        this.saleID = saleID;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public Integer getSaleID() {
        return saleID;
    }


    public String toString() {
        return   "Sale ID: " + saleID
                +"\nTotal value: " + totalValue;
    }
}
