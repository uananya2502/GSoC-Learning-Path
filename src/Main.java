import java.util.Scanner; // Import the tool to take user input

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter product price: ");
        double price = input.nextDouble();

        double taxRate = 0.18; // 18% tax
        double totalTax = price * taxRate;
        double finalPrice = price + totalTax;

        System.out.println("--- Receipt ---");
        System.out.println("Original Price: " + price);
        System.out.println("Tax (18%): " + totalTax);
        System.out.println("Final Amount: " + finalPrice);
    }
}