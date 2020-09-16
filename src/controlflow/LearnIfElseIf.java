package controlflow;

import java.util.Scanner;

public class LearnIfElseIf {


    public static void main(String[] args) {
    // calling methods only
    LearnIfElseIf.retirementCalculation();



    }

    public static void retirementCalculation(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=input.nextInt();
        if (age<=24 && age<=40){
            System.out.println("your age is more/less than 24");
        }else if (age >=40 && age <=50){
            System.out.println("Your age is more than 40");
        } else if (age >=50&& age <=60){
            System.out.println("your age is more than 50");
        }else if (age>=60&& age <=65){
            System.out.println("your age is more than 60");
        } else{
            System.out.println("its your retirement time");
        }

    }



}
