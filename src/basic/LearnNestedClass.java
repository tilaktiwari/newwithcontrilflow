package basic;

public class LearnNestedClass {

    // Nested class: child class

    int num=20;
    int num1=30;


    public static void main(String[] args) {
        LearnNestedClass lnc=new LearnNestedClass();
        System.out.println(lnc.num);
        Computer com=new Computer();
        System.out.println(com.computerName);

        System.out.println(Computer.computerPrice);

    }


    public static class Computer{

        String computerName="HP";
        static String computerPrice="2000";

        public void display(){

        }


    }







}
