
import java.util.Vector;
class Product {
    String name;
    double price;
    String category;
    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
}
public class vector  {
    private Vector<Product> inventory;
    public vector () {
        inventory = new Vector<>();
    }
    public void addProduct(String name, double price, String category) {
        Product product = new Product(name, price, category);
        inventory.add(product);
    }
    public void removeProduct(String name) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).name.equalsIgnoreCase(name)) {
                inventory.remove(i);
                break;
            }
        }
    }
    public void displayInventory() {
        System.out.println("Inventory:");
        for (Product product : inventory) {
            System.out.println("Name: "+ product.name + ", Price: " + product.price +",Category: " + product.category );
        }
    }
    public static void main(String[] args) {
        vector  manager = new vector ();
        manager.addProduct("cricket bat", 3000, "CEAT");
        manager.addProduct("T-shirt", 550, "Clothing");
        manager.addProduct("CRICKET BALL", 70, "VICKY");
        manager.displayInventory();
        manager.removeProduct("T-shirt");
        manager.displayInventory();
        manager.removeProduct("CRICKET BALL");
        manager.displayInventory();
    }
}


//Inventory:
//Name: cricket bat, Price: 3000.0,Category: CEAT
//Name: T-shirt, Price: 550.0,Category: Clothing
//Name: CRICKET BALL, Price: 70.0,Category: VICKY
//Inventory:
//Name: cricket bat, Price: 3000.0,Category: CEAT
//Name: CRICKET BALL, Price: 70.0,Category: VICKY
//Inventory:
//Name: cricket bat, Price: 3000.0,Category: CEAT
