public class Furniture {
    public String name;
    public double price;
    public int stock;
    public double width, height, depth;

    // Warning: Do not create Furniture objects directly. Instead, create only specific furniture types.
    public Furniture(String name, double width, double height, double depth, double price, int stock) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.price = price;
        this.stock = stock;
    }

    public void showProductSpecs() {
        if (this.name == "Sofa") {
            if (this.width >= 180.00) {
                System.out.print("Sofa with 3 seats");
            } else {
                System.out.print("Sofa with 2 seats");
            }
        } else if (this.name == "Table") {
            System.out.print("Table");
        } else {
            System.out.println("Chair");
        }
        System.out.printf("; Dimensions: width = %.2f; height = %.2f; %.2f%n", this.width, this.height, this.depth);
    }

    public void reduceStock(int quantity) {
        if (quantity > 0 && quantity <= stock) {
            stock -= quantity;
        } else {
            System.out.println("Invalid quantity or not enough stock for " + name);
        }
    }
}
