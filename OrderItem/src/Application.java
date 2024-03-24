import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

import entities.Client;
import entities.Product;
import entities.Order;
import entities.OrderItem;
import entities.enuns.OrderStatus;

public class Application {
    public static void main(String[] args) throws Exception {

      OrderItem bookingOrder;  
      Order order;
      
      Scanner input = new Scanner(System.in);
      SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");

      System.out.print("Enter client data:\n");
      System.out.print("Name: ");
      String user= input.nextLine();

      //input.nextLine();
      System.out.print("email: ");
      String mail = input.next();

      System.out.print("Birth date (DD/MM/YYYY): ");
      Date birth = sdt.parse(input.next());

      Client customer = new Client(user, mail, birth);

      System.out.print("Enter order data: \n");
      System.out.print("Status: ");
      OrderStatus orderStatus = OrderStatus.valueOf(input.next());

      order = new Order(new Date(), orderStatus, customer);

      System.out.print("How many items to this order? ");
      int n = input.nextInt();
      int[] num = new int[n];

      for(int i = 1; i <= num.length; i++) {
        System.out.print("Enter #" + i + " item data:\n");

        System.out.print("Product name: ");
        String label = input.next();

        System.out.print("Product price: ");
        double value = input.nextDouble();

        System.out.print("Quantity: ");
        int amount = input.nextInt();

        bookingOrder = new OrderItem(amount, new Product(label, value));
        order.addItem(bookingOrder);
      }

      System.out.println(" ");
      System.out.print("ORDER SUMMARY:\n");
      System.out.print(order);

      input.close();
    }
}
