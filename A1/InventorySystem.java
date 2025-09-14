import java.util.Scanner;
import java.util.Vector;

class Item {
    int itemId;
    String itemName;
    int quantity;

    Item() {
        input();
    }

    Item(int id, String name, int qty) {
        itemId = id;
        itemName = name;
        quantity = qty;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Item ID: ");
        itemId = sc.nextInt();
        sc.nextLine();
        System.out.print("Item Name: ");
        itemName = sc.nextLine();
        System.out.print("Quantity: ");
        quantity = sc.nextInt();
    }

    void display() {
        System.out.println(itemId + "\t| " + itemName + "\t| " + quantity);
    }
}

public class InventorySystem {
    public static void main(String[] args) {
        // Using Array
        Item[] arrayItems = new Item[5];
        System.out.println("Enter 5 items (Array):");
        for (int i = 0; i < 5; i++) {
            arrayItems[i] = new Item(); // no-arg input
        }

        System.out.println("\nArray Items:");
        for (Item item : arrayItems) item.display();

        // Using Vector
        Vector<Item> vectorItems = new Vector<>();
        System.out.println("\nEnter items dynamically (Vector), type 0 for ID to stop:");
        while (true) {
            Item temp = new Item();
            if (temp.itemId == 0) break;
            vectorItems.add(temp);
        }

        System.out.println("\nVector Items:");
        for (Item item : vectorItems) item.display();
    }
}
