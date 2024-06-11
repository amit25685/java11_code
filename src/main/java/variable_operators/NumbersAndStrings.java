package variable_operators;

public class NumbersAndStrings {
    public static void main(String[] aa){
        String name= "Steve";
        String items = "cables";
        String message;
        int quantity=5;
        double price=3.99;

        message= name+" ordered "+quantity+ " "+ items+ " at $"+ price+ " . ";
        System.out.println(message);
        System.out.printf("The total was: %f\n ",quantity*price);
        System.out.println("One more : "+(quantity+1));
        System.out.println(message);
    }
}
