package expression_array_loops;

public class ForArrayDemo {
    public static void main(String[] args) {
        String[] names = { "Steve", "Mary", "William" };

        for(String name : names) {
            System.out.println("Name is " + name);
        }

        System.out.println();

        int[] ages = { 39, 27, 97 };

        for(int age : ages) {
            System.out.println("Age is " + age);
        }
    }

}
