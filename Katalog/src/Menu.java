import java.util.Scanner;

public class Menu {
private Catalog catalog;
private Scanner scanner;

public Menu() {
    catalog = new Catalog();
    scanner = new Scanner(System.in);
}
public void displayMenu() {

    while (true) {
        System.out.println("1. Add product");
        System.out.println("2. View catalog");
        System.out.println("3. Exit");
        System.out.println("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                addProduct();
                break;
            case 2:
                catalog.ListProducts();
                break;
            case 3:
                System.out.println("Exiting");
                scanner.close();
                return;
            default:
                System.out.println("Invalid option.");
        }
    }

}
private void addProduct(){
    System.out.println("Enter product name: ");
    String name = scanner.nextLine();

    System.out.println("Enter product price");
    int price = scanner.nextInt();
    scanner.nextLine();

    Product product = new Product(name, price);
    catalog.AddProduct(product);
    System.out.println("Product added!");
}

}
