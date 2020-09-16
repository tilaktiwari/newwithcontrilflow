package controlflow;

import java.util.Scanner;

public class LearnSwitchCase {
    // SwitchCase

    public static void main(String[] args) {
        // int foodSerial = 9;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Food Serial Number");
        int foodSerial = input.nextInt();
        LearnSwitchCase.foodMenu(foodSerial);

    }

    public static void foodMenu(int foodSerial) {
        String foodName;
        switch (foodSerial) {
            case 1:
                foodName = "Pizza";
                break;
            case 2:
                foodName = "Couscous";
                break;
            case 3:
                foodName = "Chicken curry";
                break;
            case 4:
                foodName = "tacos";
                break;
            case 5:
                foodName = "spaghetti";
                break;
            case 6:
                foodName = "burger";
                break;
            case 7:
                foodName = "Sushi";
                break;
            case 8:
                foodName = "fried rice";
                break;
            case 9:
                foodName = "fried chicken";
                String rice = "Brown";
                if (rice == "white") {
                    System.out.println("you select white rice");
                } else {
                    System.out.println("you select Brown rice");
                }
                break;
            case 10:
                foodName = "Coffee";
                break;
            default:
                foodName = "Invalid Food Item";
                break;
        }
        System.out.println("Selected Food is " + foodName);

    }


}
