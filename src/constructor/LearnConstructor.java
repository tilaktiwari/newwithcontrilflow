package constructor;

public class LearnConstructor {
    // Constructor:
    // Constructor name should be same name as class
    // Constructor has no return type
    // Constructor are used to initialize object

    // AccessModifier className (){     }

    // declare variable
    String name;
    String address;
    String contactNumber;


    public LearnConstructor() {
        // Default Constructor: without parameter/signature
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");

    }

    public LearnConstructor(String name) {
        //Single Parameterized Constructor
        // Add Signature/ Pattern/ Parameter
        this.name = name;
        System.out.println(this.name);
    }

    public LearnConstructor(String name, int num1) {
        //Multi Parameterized Constructor
        int number1 = num1;
        this.name = name;
       System.out.println("My Name is " + this.name + " " + "Age is " + number1);
    }

    public LearnConstructor(String name, String address){
        this.name=name;
        this.address=address;
        System.out.println("My Name is "+this.name+" "+"Address is "+this.address);
    }
    public LearnConstructor(String name, String address, String contactNumber){
        this.name=name;
        this.address=address;
        this.contactNumber=contactNumber;
        System.out.println("My Name is "+this.name+" "+"Address is "+this.address+" "+"Contact Number is "+this.contactNumber);
    }

    int num3 = 33;

    public void display() {
        int number = 40;
    }

    public static void main(String[] args) {
        // object
        LearnConstructor lc = new LearnConstructor();

        int num = 20;
        int num1 = 30;

        // Can we create multiple object of same class?
        LearnConstructor obj = new LearnConstructor("James"); // Argument passing inside parameter

        LearnConstructor jack = new LearnConstructor("Jack", 24);

        LearnConstructor runa=new LearnConstructor("Runa Parvin","Queens,NY");

        LearnConstructor shaila =new LearnConstructor("Shaila Hasib","Bronx,NY","6564564645");


    }


}
