package expression_array_loops;

public class Exercise03 {
    public static void main(String[] args) {
        String[] names = { "Steve", "", "Mary", "William", "" };

        for(String name : names) {
            if(name == "") {
                System.out.println("Empty name");
            } else {
                System.out.println("Name is " + name);
            }
        }

    }
}
