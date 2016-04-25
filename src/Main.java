import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    // boolean method that will return true if the user chooses to play again
    private static boolean playAgain() {
        // output end message
        out.println("Congratulations, you entered correctly. Would you like to play again?");
        // create scanner object to read input
        Scanner s = new Scanner(in);
        // catch input and store it in a string called answer
        String answer = s.nextLine();
        // evaluate if the user entered "y" or "Y", if so return true, else return false
        return (answer.equals("y")) || (answer.equals("Y"));
    }

    // main method - this is where the program starts
    public static void main(String[] args) {
        // create inputNumber object that contains methods read input
        inputANumber inputNumber = new inputANumber();
        // create checker object which contains methods to check inputted number against generated number
        numberChecker checker = new numberChecker();
        // create integer variable to store entered number
        int enteredNumber;

        // loop though the following while the user wants to play again
        do {
            // output welcome message
            out.println("Welcome to the random number guessing game.\nWould you like to see the help screen?");
            // create scanner object to read input
            Scanner s = new Scanner(in);
            // catch input and store it in a string called answer
            String answer = s.nextLine();
            // evaluate if the user entered "y" or "Y", if so output help message
            if(answer.equals("y") || answer.equals("Y")) out.println("This is a random number guessing game. \n" +
                    "When you start the game a number is generated at random, " +
                    "You then have an unlimited number of opportunities to guess " +
                    "this number. If you guess wrong you will be told if you guessed " +
                    "too low or too high.");
            // generate a new random number
            checker.generate();

            // loop though the following while the entered number is not correct
            do {
                // store entered number as integer
                enteredNumber = inputNumber.getNumber();
            } while (!checker.isNumberCorrect(enteredNumber));

        } while (playAgain());

        out.println("Exiting...");
    }
}
