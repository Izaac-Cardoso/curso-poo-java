package entities;

import java.util.Date;
import java.util.ArrayList;

import entities.enuns.OrderStatus;

public class Order {
   private Date moment;
   private Client client;
   private OrderStatus status;

   private ArrayList<OrderItem> receipt = new ArrayList<> ();

   public Order(Date instant, OrderStatus orderStatus, Client customer) {
      moment = instant;
      status = orderStatus;
      client = customer;
   }

   public Date getMoment() {
      return moment;
   }

   public OrderStatus getStatus() {
      return status;
   }

   public void addItem(OrderItem item) {
      receipt.add(item);
   }

   public void removeItem(OrderItem item) {
      receipt.remove(item);
   }

   public double total() {
      double sum = 0;
      for(OrderItem item : receipt) {
         sum += item.subTotal();
      }
      return sum;
   }

   @Override
   public String toString() {
      StringBuilder msg = new StringBuilder();
      msg.append("Order moment: " + getMoment() + "\n");
      msg.append("Order status: " + getStatus() + "\n");
      msg.append("Client: " + client + "\n");
      msg.append("Order items: \n");
      for(OrderItem item : receipt) {
         msg.append(item + "\n");
      }
      msg.append("Total price: $" + total());
      return msg.toString();
   }

}
