package expression_array_loops;

public class NestedIfElseDemo {
    public static void main(String[] args) {
        int quantity = 2;
        int stock = 1;
        double price = 99.99;
        String itemDescription = "Skateboard";

        if(stock > 0) {
            if(quantity <= stock) {
                double total = quantity * price;
                String suffix = "";
                if(quantity > 1) {
                    suffix = "s";
                }
                System.out.println("Your order of " + quantity
                        + " " + itemDescription + suffix
                        + " at " + price + " each"
                        + " comes to: " + total);

            } else {
                System.out.println("The " + itemDescription + " quantity: " + quantity
                        + ", is greater than the remaining stock: " + stock + ".");
            }

        } else {
            System.out.println(itemDescription + "s are out of stock!");
        }
    }

}
