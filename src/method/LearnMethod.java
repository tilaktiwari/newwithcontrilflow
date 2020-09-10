package method;

public class LearnMethod {
    // Method: block of code which runs when it is called. Method is used to perform
    // certain actions and they are known as function
    // Method Type:
    // Return Method without Parameter:
    // Return Method with Parameter:
    // Non Return Method without Parameter:
    // Non Return Method with Parameter:

    // Method Syntax: AccessModifier ReturnType/MethodType MethodName(){ Method Body}
    // ReturnType/MethodType : Data Type/Class Type
    // MethodName: verb+Noun

    // Method Syntax:
    // AccessModifier ReturnType/MethodType MethodName(){ Method Body }

    // Return Types are: All Data type, void,class and object.

    // Method Syntax: AccessModifier ReturnType/MethodType MethodName(){ Method Body
    // }
    public static String name = "james";

    // AccessModifier ReturnType/MethodType MethodName(){ Mehtod body }

    public static int doSummation() {
        // Return Method without Parameter
        int num1 = 40;
        int num2 = 30;
        int total = num1 + num2;
        System.out.println("Total value is " + total);
        return total;
    }

    public static int doSum(int number1, int number2) {
        // Return Method with Parameter/ Dynamic method:
        int num1 = number1;
        int num2 = number2;
        int total = num1 + num2;
        System.out.println("Total value is " + total);
        return total;
    }

    public static int doMultiply(int number1, int number2) {
        // Return Method with Parameter/ Dynamic method:
        int num1 = number1;
        int num2 = number2;
        int total = num1 * num2;
        System.out.println("Total value is " + total);
        return total;
    }

    // Non Return Method without Parameter:
    public static void studentInfo(){
        String name="James";
        String address="Queens,NY";
        System.out.println("Student name is "+name+" "+"Address is "+address);
    }
    // Non Return Method with Parameter:
    public static void studentInformation(String stName, String stAddress){
        String name=stName;
        String address=stAddress;
        System.out.println("Student name is "+name+" "+"Address is "+address);
    }
    public static String studentInformation1(String stName, String stAddress){
        String name=stName;
        String address=stAddress;
       // System.out.println("Student name is "+name+" "+"Address is "+address);
        return "Student name is "+name+" "+"Address is "+address;
    }
    public static double doSub(double number1, double number2) {
        // Return Method with Parameter/ Dynamic method:
        double num1 = number1;
        double num2 = number2;
        double total = num1 - num2;
        System.out.println("Total value is " + total);
        return total;
    }
    public static double doDivision(double number1, double number2) {
        // Return Method with Parameter/ Dynamic method:
        double num1 = number1;
        double num2 = number2;
        double total = num1 /num2;
        System.out.println("Total Division value is " + total);
        return total;
    }
    public static double doRemainder(double number1, double number2) {
        // Return Method with Parameter/ Dynamic method:
        double num1 = number1;
        double num2 = number2;
        double total = num1 %num2;
        System.out.println("Remainder value is " + total);
        return total;
    }

    public static void main(String[] args) {
        LearnMethod.doSummation();//70
        LearnMethod.doSum(50, 70);
        LearnMethod.doMultiply(23, 25);
        LearnMethod.studentInfo();
        LearnMethod.studentInformation("Rois","Bronx,NY");
        LearnMethod.studentInformation1("Soumia","Annadal,VA");
        LearnMethod.doSub(400,40);
        LearnMethod.doDivision(300,24);
        LearnMethod.doRemainder(200,21);


    }


}
