package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entiities.enums.OrderStatus;
import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birth = sdf.parse(sc.next());
		Client client = new Client(name,email,birth);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		Order order = new Order(new Date(),status,client);
		
		
		for(int i = 1 ; i<=n ; i++) {
			sc.nextLine();
			System.out.printf("Enter #%d item data:\n",i);
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price:");
			double price = sc.nextDouble();
			System.out.print("Quantity:");
			int quantity = sc.nextInt();
			
			OrderItem orderitem = new OrderItem(quantity,price,new Product(productName,price));
			order.addOrderItem(orderitem);
		}
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		sc.close();
		
		
		
	}

}
