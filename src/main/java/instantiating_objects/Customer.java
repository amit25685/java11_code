package instantiating_objects;

public class Customer {
    public String name = "";
    public int    custID;
    public String address = "";
    public int    orderNum;
    public int    age;

    public void displayCustomer(){
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
