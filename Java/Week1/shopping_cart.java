import java.util.Scanner;

public class shopping_cart {
    public static void main(String[] args) {
        
        // SHOPPING CART PROGRAM

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        // char currency = '$';
        double total;

        System.out.print("What would you like to purchase? : ");
        item = scanner.nextLine();

        System.out.print("What is the price of each item?: ");
        price = scanner.nextDouble();

        System.out.print("How many items would you like to purchase?: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + total);

        scanner.close();


    }
}
