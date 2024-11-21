public class Item {

    private int id;
    private String name;
    private int quantity;
    private double pricePerUnit;

    Item(){

    }

    Item(int id, String name, int quantity, double pricePerUnit){
        this.id = id;
        this.name = name;
        this.quantity= quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public String toString(){
        return id + " " + name + " " + quantity + " " + pricePerUnit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
}
