import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Library Inventory System ---");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Search item");
            System.out.println("4. List all items");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter item ID: ");
                    int newId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter item name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int newQty = scanner.nextInt();
                    items.add(new Item(newId, newName, newQty));
                    System.out.println("Item added.");
                    break;
                case 2:
                    System.out.print("Enter ID of item to remove: ");
                    int removeId = scanner.nextInt();
                    boolean removed = items.removeIf(item -> item.id == removeId);

                    if (removed) {
                        System.out.println("Item removed.");
                    } else {
                        System.out.println("No item found with that ID.");
                    }
                    break;
                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    boolean found = false;

                    for (Item item : items) {
                        if (item.name.equalsIgnoreCase(searchName)) {
                            System.out.println("Found — ID: " + item.id + " | Name: " + item.name + " | Qty: " + item.quantity);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("No item found with that name.");
                    }
                    break;
                case 4:
                    if (items.isEmpty()) {
                        System.out.println("No items in inventory.");
                    } else {
                        System.out.println("--- Inventory ---");
                        for (Item item : items) {
                            System.out.println("ID: " + item.id + " | Name: " + item.name + " | Qty: " + item.quantity);
                        }
                    }
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option, try again.");
            }
        }
        scanner.close();
    }
}