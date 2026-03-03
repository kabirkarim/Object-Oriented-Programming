import java.util.Scanner;

class Product {
    private String name;
    private double price;
    private int quantity;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price >= 0) this.price = price;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) this.quantity = quantity;
    }
    
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalValue() {
        return price * quantity;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[3];
        double total = 0;

        for (int i = 0; i < 3; i++) {
            products[i] = new Product();

            System.out.print("Enter name: ");
            products[i].setName(sc.nextLine());

            System.out.print("Enter price: ");
            products[i].setPrice(sc.nextDouble());

            System.out.print("Enter quantity: ");
            products[i].setQuantity(sc.nextInt());
            sc.nextLine();

            total += products[i].getTotalValue();
        }
        System.out.println("------------Product Details-----------------");
        for (int i = 0; i < 3; i++) {
            System.out.println("Product: " + products[i].getName() + ", Price: " + products[i].getPrice() + ", Quantity: " + products[i].getQuantity());
        }
        System.out.println("Total Inventory Value: " + total);
        sc.close();
    }
}/*
Task: Product Inventory Tracker

Problem Statement:
Develop an inventory tracker for products using encapsulated fields.

Class Name: Product

Private Fields:
- name (String)
- price (double)
- quantity (int)

Requirements:
- Setters must prevent negative values for price and quantity.
- Add a method getTotalValue() that returns price × quantity.
- In main, use a loop to allow the user to input details for 3 products.
- Output the total inventory value of all products combined.
*/