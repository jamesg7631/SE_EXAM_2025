public class User {
    public String name;
    public Cart cart;

    public User(String name) {
        this.name = name;
        this.cart = new Cart();
    }
}
