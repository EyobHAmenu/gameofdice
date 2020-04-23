import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        /*
            display a welcome message
            open a while loop
            generate two numbers 1-6
            then check the numbers
            if both of the numbers is equal to 1 add 25 to the score
            if only one of the numbers is equal to 1 add 0 or skip
            else if both numbers are different from 1 add the sum of the two numbers on score
            Ask the user "Roll again?"
            if the user answer yes stay in the loop else stop the loop
            Also if score is greater than 100 then we stop the loop
         */

        Random run = new Random();
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int score = 0;
        String respo;
        String again = "yes";
        System.out.println("Welcome! Let's Play Roll Dice!");
        while(again.equalsIgnoreCase("yes") && score <= 100){
            num1 = 1 + run.nextInt(6);
            num2 = 1 + run.nextInt(6);
            System.out.println("Your rolls " + num1 + " & " + num2);
            if(num1 == 1 && num2 == 1){ // check if both numbers are equal to 1.
                score = score + 25;  // if true add 25 on the total score.
            }
            else if(num1 == 1 || num2 == 1){ // check if one of the numbers is equal to one.
                score = score + 0; // if true add 0 to the total score.
            }
            else{       // if both numbers are different from one.
                score = score + num1 + num2; // add both numbers on the total score.
            }

            System.out.println("Your score is: " + score);
            System.out.print("Roll again? ");
            respo = sc.nextLine();
            if (respo.equalsIgnoreCase("No")){
                again = "No";
            }

        }

        if (score > 100){
            System.out.println("You have scored over 100");
        }
        System.out.println("Thank you for playing!");

    }
}
