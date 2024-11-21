import java.util.Scanner;

public class Inventory {
    static Scanner scanner = new Scanner(System.in);
    static InventoryManagement manageItems = new InventoryManagement();

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.displayMenu();
        int option = 0;
        while(option != 5) {
            option = scanner.nextInt();
            switch (option) {
                case (1):
                    inventory.addNewItem();
                    break;
                case (2):
                    inventory.updateItemFromInventory();
                    break;
                case (3):
                    inventory.deleteItemFromInventory();
                    break;
                case (4):
                    manageItems.listItem();
                    inventory.displayMenu();
                    break;
            }
        }
    }

    public  void displayMenu(){
            System.out.println("1. Add new items to the inventory" + "\n" +
                    "2. Update item details" + "\n" +
                    "3. Delete items from inventory" + "\n" +
                    "4. Display all items" + "\n" +
                    "5. Exit");
    }


    public void addNewItem(){
        System.out.println("Product id: ");
        int idProduct = scanner.nextInt();
        System.out.println("Product name");
        String nameProduct = scanner.next();
        System.out.println("Product quantity");
        int quantityProduct = scanner.nextInt();
        System.out.println("Product price");
        double priceProduct = scanner.nextDouble();
        Item item = new Item(idProduct, nameProduct, quantityProduct, priceProduct);
        manageItems.addItem(item);
        System.out.println("1. Add more items" + "\n" +
                           "2. Back");
        int selection = scanner.nextInt();
        if(selection == 1) {
            addNewItem();
        } else {
            displayMenu();
        }
    }


    public void updateItemFromInventory(){
        manageItems.listItem();
        System.out.println("The ID of product you want to modify");
        int id = scanner.nextInt();
        System.out.println(manageItems.getInventory().get(id));
        System.out.println("Product new name: ");
        String name = scanner.next();
        System.out.println("Product new quantity: ");
        int quantity = scanner.nextInt();
        System.out.println("Product new price: ");
        int price = scanner.nextInt();
        manageItems.updateItem(id, name, quantity, price);
        System.out.println("1. Continue " + "\n" +
                           "2. Back");
        int option = scanner.nextInt();
        if(option == 1){
            updateItemFromInventory();
        } else {
            displayMenu();
        }
    }

    public void deleteItemFromInventory(){
        manageItems.listItem();
        System.out.println("The product ID to be deleted");
        int id = scanner.nextInt();
        System.out.println("Are you sure you want to delete " + manageItems.getInventory().get(id) + " " + "yes/no");
        String answer = scanner.next();
        answer.toLowerCase();
        if(answer.equals("yes")) {
            manageItems.deleteItem(id);
            displayMenu();
        } else {
            displayMenu();
        }
    }
}
