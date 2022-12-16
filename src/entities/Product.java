package entities;

public class Product {
    private String name;
    private Integer quantity;
    private Double price;

    private String code;

    public Product(String name, Integer quantity, Double price, String code) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.code = code;
    }

    public Product() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public String getCode() {
        return code;
    }

    public void removeProductFromStock(int qtyToBuy) {
        quantity -= qtyToBuy;
    }

    public double totalValue(double productPrice, int qtyToBuy) {
        return productPrice * qtyToBuy;
    }

    public String toString() {
        return  "Product name: " + name
                +"\nProduct code: " + code
                +"\nCurrent product quantity in stock: " + quantity
                +"\nProduct price: " + price;
    }
}
