package basic;

public class LearnBlock {


   //System.out.println("Hello");

    { // block startPoint
        // block

        System.out.println("This is a block");
        System.out.println("This is a block");
        System.out.println("This is a block");
        System.out.println("This is a block");
        System.out.println("This is a block");
        System.out.println("This is a block");

    } // block endPoint

    public static void display(){

        System.out.println("This is from outside  of block");

        {

            System.out.println("This is from inside of block");
            System.out.println("This is from inside of block");

        }
    }


    public static void main(String[] args) {
        // psvm
        System.out.println("World");
        LearnBlock.display();


    }


}
