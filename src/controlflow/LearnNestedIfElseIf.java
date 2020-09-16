package controlflow;

public class LearnNestedIfElseIf {


    public static void main(String[] args) {
        // Nested If else: child if else
        // windows: ctrl+Alter+L for line format/ line indent
        // Mac: command +option+L for line format

        int score = 95;

        if (score >= 90) {

            System.out.println("You got A+");
            if (score == 92) {
                System.out.println("You are Excellent");
            } else {
                if (score == 95) {
                    System.out.println("You are Genius");
                }
            }
        } else if (score >= 80) {
            System.out.println("You got A-");
        } else if (score >= 70) {
            System.out.println("You got A");
        } else if (score >= 60) {
            System.out.println("You got B+");
        }


    }
}
