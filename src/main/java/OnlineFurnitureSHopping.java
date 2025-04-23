public class OnlineFurnitureSHopping {
    public static void main(String[] args) {
        // Create furniture items
        Furniture sofa = new Sofa(99.00, 59.00, 69.00, 499.99, 5);
        Furniture table = new Table(60.00, 40.00, 50.00, 299.99, 3);
        Furniture chair = new Chair(39.00, 69.00, 59.00, 149.99, 10);

        sofa.showProductSpecs();
        table.showProductSpecs();
        chair.showProductSpecs();

        // Create user
        User user = new User("Alice");

        // Add furniture to cart
        user.cart.addFurniture(sofa);
        user.cart.addFurniture(table);
        user.cart.addFurniture(chair);

        // Checkout
        user.cart.checkout();
    }
}
