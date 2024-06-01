import java.util.*;

public class ShoppingCartApp {

    private List<Item> items = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    private static class Item {
        private int itemNo;
        private String itemName;
        private double price;

        public Item(int itemNo, String itemName, double price) {
            this.itemNo = itemNo;
            this.itemName = itemName;
            this.price = price;
        }

    }

    private void addItems() {
        // Scanner sc = new Scanner(System.in);
        System.out.print("Enter Item No: ");
        int itemNo = sc.nextInt();
        System.out.print("Enter Item Name: ");
        String itemName = sc.next();
        System.out.print("Enter Item Price: ");
        double price = sc.nextDouble();
        items.add(new Item(itemNo, itemName, price));
    }

    private void showItems() {
        System.out.println("*********** MENU ************");
        System.out.println("Item No\tItem Name\tPrice");
        for (Item item : items) {
            System.out.println(item.itemNo + "\t" + item.itemName + "\t" + item.price);
        }
    }

    private void updateItem() {
        System.out.println("Enter the Item No to update:");
        int itemNoToUpdate = sc.nextInt();
        for (Item item : items) {
            if (item.itemNo == itemNoToUpdate) {
                System.out.println("What do you want to update?");
                System.out.println("1. Item No");
                System.out.println("2. Item Name");
                System.out.println("3. Price");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter new Item No:");
                        int newItemNo = sc.nextInt();
                        item.itemNo = newItemNo;
                        break;
                    case 2:
                        System.out.println("Enter new Item Name:");
                        String newItemName = sc.next();
                        item.itemName = newItemName;
                        break;
                    case 3:
                        System.out.println("Enter new Price:");
                        double newPrice = sc.nextDouble();
                        item.price = newPrice;
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        return;
                }
                System.out.println("Item updated successfully.");
                return;
            }
        }
        System.out.println("Item not found.");
    }
    

    private void deleteItem() {
        System.out.print("Enter Item No to delete: ");
        int itemNo = sc.nextInt();
        Iterator<Item> iterator = items.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.itemNo == itemNo) {
                iterator.remove();
                System.out.println("Item deleted successfully.");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    private void orderMenu() {
        System.out.println("Menu:");
        showItems();
        System.out.println("Enter the Item No to add to cart (0 to exit):");
        int itemNo = sc.nextInt();
        if (itemNo == 0) {
            return;
        }
        for (Item item : items) {
            if (item.itemNo == itemNo) {
                // Add item to cart
                System.out.println("Added " + item.itemName + " to cart.");
                return;
            }
        }
        System.out.println("Item not found in the menu.");
    }

    public static void main(String[] args) {
        ShoppingCartApp shoppingCart = new ShoppingCartApp();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add Item");
            System.out.println("2. Show Items");
            System.out.println("3. Delete Item");
            System.out.println("4. Update Item");
            System.out.println("5. Place Order");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    shoppingCart.addItems();
                    break;
                case 2:
                    shoppingCart.showItems();
                    break;
                case 3:
                    shoppingCart.deleteItem();
                    break;
                case 4:
                    shoppingCart.updateItem();
                    break;
                case 5:
                    shoppingCart.orderMenu();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);
        sc.close();
    }
}
