package expression_array_loops;

public class ArrayElementDemo {
    public static void main(String[] aa){
        int[] ages= {39,27,97};
        int  myAge=ages[0];
        int yourAge=ages[1];

        System.out.println("My age is: "+myAge);
        System.out.println("Your age is: "+yourAge);
        System.out.println("My friends age is: "+ages[2]);

        String[] names={"Steve", "Mary","William"};

        names[2]="Bill";

        System.out.println("names[2]: "+names[2]);
    }
}
