package variable_operators;

public class IntAndDoubleExample {
    public static void main(String[] aa){
        int lowest= -2147483648;
        int highest= 2147483647;
        //or
        // int highest= 2_147_483_647;

        double bigDecimalValue= 3743743933485673.92348773838234;
        double scientificValue=2.345123e-22;

        System.out.println(("Lowest: "+lowest));
        System.out.println(("Highest: "+highest));

        System.out.println(("bigDecimalValue: "+bigDecimalValue));
        System.out.println(("scientificValue: "+scientificValue));

        int quantity1=10;
        //int quantity2=5.5;

        double price1=29.99;
        double price2=10;

        double result= quantity1*price1;
        System.out.println(result);


    }
}
