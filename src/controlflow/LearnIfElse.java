package controlflow;

public class LearnIfElse {
    // control flow: Make some decision

    // if(condition){ }
    // if condition is true then it will execute if block and
    // if condition is false it will execute else block

    // ctrl+shift+f = format code

    public static void main(String[] args) {
        int number =24;

        if(number == 24){
            System.out.println("Number is 24");
        } else {
            System.out.println("Number is not 24");
        }
        int age=55;
        if (age >= 18 && age<21){
            System.out.println("you are Adult but you can not buy Cigarette");
        } else {
            System.out.println("you are not adult");
        }

        String gender="female";
        if (     gender == "female" || age>=50    &&    number==32){
            System.out.println("you dont have to buy ticket");
        }else{
            System.out.println("you have to buy ticket");
        }

        if ( gender == "male" || age>=50 && number==32){
            System.out.println("you dont have to buy ticket");
        }else{
            System.out.println("you have to buy ticket");
        }


    }

}
