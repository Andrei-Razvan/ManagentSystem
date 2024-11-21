import java.util.ArrayList;
import java.util.List;

public class InventoryManagement {


    private List<Item> inventory  = new ArrayList<>();

    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }

    public void InventoryManager(){
        inventory = new ArrayList<>();
    }

    public void addItem(Item item){
        inventory.add(item);
        System.out.println(item);
    }

    public void deleteItem(int id){
        inventory.removeIf(item -> inventory.indexOf(item) == id );
        System.out.println(id);
    }

    public void updateItem(int id, String name, int quantity, double price){
        for(Item item : inventory) {
            item.setName(name);
            item.setQuantity(quantity);
            item.setPricePerUnit(price);
            System.out.println(item);
            return;
        }
    }

    public void listItem(){
        if(inventory.isEmpty()){
            System.out.println("No item in inventory");
        } else {
            inventory.forEach(System.out::println);
        }
    }
}
