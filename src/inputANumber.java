import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.System.out;

// class to handle the inputting of numbers
class inputANumber {
    // create private variable to store Scanner object
    private Scanner s;

    // constructor initialises scanner object
    inputANumber() {
        s = new Scanner(System.in);
    }

    // method to get an input from a user
    int getNumber(){
        // Ask the user to enter a number
        out.println("Please enter a number:");
        // try capturing an integer if it's not a integer tell the user to try again
        try {
            return s.nextInt();
        } catch (InputMismatchException e){
            out.println("That is not a valid option please try again");
            return -1;
        }
    }
}
