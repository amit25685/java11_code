package variable_operators;

public class UsingVariables {
    public static void main(String[] args){
        String name="Steve";
        int quantity=2;
        double price=9.99;
        boolean outOfStock=false;

        String anotherName= name;
        double amount=price* quantity;
        System.out.println(name);
        System.out.println(quantity);
        System.out.println(price);
        System.out.println(outOfStock);
        System.out.println(anotherName);
        System.out.println(amount);
    }
}
