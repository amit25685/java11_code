package instantiating_objects;

public class InstantiatingObjects {
    public static void main(String[] args) {
        Customer alice = new Customer();
        Customer bob = new Customer();

        alice.name = "Alice";
        alice.age = 27;

        bob.name = "Bob";
        bob.age = 40;

        alice.displayCustomer();
        bob.displayCustomer();
    }
}
