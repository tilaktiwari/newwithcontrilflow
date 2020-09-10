package operators;

public class LearnConditionalOperator {

    // && Conditional AND: all condition must have to be true then it will execute block of code
    // || Conditional OR: if one condition is true then block of code will execute

    // pipe ||

    public static void main(String[] args) {
        //

        int num1=50;
        int num2=50;
        if (num1 ==num2){
            System.out.println("Number1 and Number2 is Equal");
        }
        if (num1==50 && num2 == 50){
            System.out.println("We love to eat Burger");
        }
        if (num1==52 || num2 == 50){
            System.out.println("We love to eat Pizza");
        }


    }


}
