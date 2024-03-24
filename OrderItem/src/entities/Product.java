package entities;

public class Product {
    private String prodName;
    private double price;
 
    public Product() {
    }
 
    public Product(String label, double value) {
       prodName = label;
       price = value;
    }
 
    public String getProdName() {
       return prodName;
    }
 
    public double getPrice() {
       return price;
    }
}
