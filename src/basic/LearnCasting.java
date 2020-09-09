package basic;

public class LearnCasting {
    // Casting: Casting means converting data type
    // Primitive dataType to Primitive Data type
    // NonPrimitive to NonPrimitive



    public static void main(String[] args) {
        double price = 35.999;
        int newPrice = (int) price;
        System.out.println(newPrice);

        int num1 = 50;
        int num2 = 40;
        int num3 = num1;
        int num4 = num3 + num2;
        System.out.println(num4); //

        int age = 24;
        double newAge=(double) age;
        System.out.println(newAge);

        int number=56;
        byte total=(byte) number;
        System.out.println("Int to Byte "+total);

    }


}
