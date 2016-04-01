import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    private static boolean playAgain() {
        out.println("Congratulations, you entered correctly. Would you like to play again?");
        Scanner s = new Scanner(in);
        String answer = s.nextLine();
        return (Objects.equals("y", answer)) || (Objects.equals(answer, "Y"));
    }

    public static void main(String[] args) {
        inputANumber inputNumber = new inputANumber();
        numberChecker checker = new numberChecker();
        int enteredNumber;

        do {
            out.println("Welcome to the random number guessing game.");
            new numberGenerator();

            do {
                enteredNumber = inputNumber.getNumber();
            } while (!checker.isNumberCorrect(enteredNumber));
        } while (playAgain());

        out.println("Exiting...");
    }
}
