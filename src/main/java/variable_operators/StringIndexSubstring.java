package variable_operators;

public class StringIndexSubstring {
    public static void main(String[] aa){
        String ipAddress="122.72.1.45";
        System.out.println("IP  Address"+ipAddress);

        int index1=ipAddress.indexOf('.');
        System.out.println("The index of '.':"+index1);

        int index2=ipAddress.indexOf('.', index1+1);
        System.out.println("The second index of '.':"+index2);

        String secondByte=ipAddress.substring(index1+1,index2);
        System.out.println("Second byte of the ipAddress is: "+secondByte);


    }
}
