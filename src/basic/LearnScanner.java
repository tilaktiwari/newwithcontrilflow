package basic;

import java.util.Scanner;

public class LearnScanner {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your First name");
        String fName = input.nextLine();
        System.out.println("First Name is "+fName);
        System.out.println("Enter your Last name");
        String lName = input.nextLine();
        System.out.println("Last Name is "+lName);
        System.out.println("Enter course fee");
        double cFee=input.nextDouble();
        System.out.println("Course Fee : "+cFee);
        System.out.println("Enter Discount percentage");
        double discountPercentage=input.nextDouble();
        System.out.println("course fee after Discount "+ cFee * (1-discountPercentage)/100);
        Scanner input1 = new Scanner(System.in);

        input.close();
        input1.close();

    }


}
