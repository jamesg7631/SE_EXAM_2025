import java.util.ArrayList;

public class Cart {
    public ArrayList<Furniture> items = new ArrayList<>();

    public void addFurniture(Furniture furniture) {
        if (furniture.stock > 0) {
            items.add(furniture);
            furniture.reduceStock(1);
            System.out.println(furniture.name + " added to cart.");
        } else {
            System.out.println("Sorry, " + furniture.name + " is out of stock.");
        }
    }

    public double getTotalPrice() {
        double sum = 0;
        for (Furniture furniture: items) {
            sum += furniture.price;
        }
        return sum;
    }

    public void checkout() {
        if (items.isEmpty()) {
            System.out.println("Your cart is empty. Add items before checkout.");
            return;
        }
        System.out.println("Checking out... Total price: $" + getTotalPrice());
        items.clear();
        System.out.println("Thank you for shopping with us!");
    }
}
