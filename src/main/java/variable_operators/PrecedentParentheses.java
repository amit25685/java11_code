package variable_operators;

public class PrecedentParentheses {
    public static void main(String[] aa){
        int j=4;
        System.out.println("j: "+j);

        j++;//j=j+1
        System.out.println("j: "+j);

        j--;//j=j-1
        System.out.println("j: "+j);

        int c=25-j*4/2-10+4;

        System.out.println("c: "+c);
    }
}
