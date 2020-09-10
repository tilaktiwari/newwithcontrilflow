package string;

public class LearnString {
    // Windows: ctrl+click
    String name="James";

    // String is a data type
    // String is a class

    public static void main(String[] args) {
        String burgerName="American Burger";
        System.out.println(burgerName.length());
        System.out.println(burgerName.equals("American Burger"));
        System.out.println(burgerName.equalsIgnoreCase("American burger"));
        System.out.println(burgerName.charAt(5));
        System.out.println(burgerName.substring(6));
        System.out.println(burgerName.substring(3,9));
        System.out.println(burgerName.toUpperCase());
        System.out.println(burgerName.toLowerCase());

        String stID="101";
        String lName="William";
        System.out.println(stID.concat(lName));


        // Exception Handling
        // String Index Out Of Bounds Exception
        try{
            System.out.println(burgerName.charAt(25));
        } catch (Exception e){
            //e.printStackTrace();
            System.out.println("String Index Out Of Bounds Exception");
        }

        // Reverse string:
        // uppercase
        // lower case
        // remove
        // trim







    }



}
