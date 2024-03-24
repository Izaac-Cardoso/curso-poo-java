package entities;

public class OrderItem {
    private int quantity;

    Product product;
 
    public OrderItem(int amount, Product p) {
       quantity = amount;
       product = p;
    }
 
    public double subTotal() {
        return quantity * product.getPrice();
    }

    @Override
    public String toString() {
      StringBuilder msg = new StringBuilder();
      System.out.print("Order items:\n");
      msg.append(product.getProdName() + ", $");
      msg.append(product.getPrice() + ", ");
      msg.append("Quantity: " + quantity + ", ");
      msg.append("Subtotal: $" + String.format("%.2f", subTotal()));
      return msg.toString(); 
   }   
}

