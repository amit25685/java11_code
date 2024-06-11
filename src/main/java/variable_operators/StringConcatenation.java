package variable_operators;

public class StringConcatenation {
    public static void main(String[] aa){
        String greeting1="Hello";
        String greeting2="Hi";

        String recipient1="Hello";
        String recipient2="Steave";

        String message= greeting1 + ", "+ recipient1+"!";

        System.out.println(message);
        System.out.println(greeting2+", "+recipient2+"!");
    }
}
