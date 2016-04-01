import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by ross on 3/30/16.
 * Should be used as part of OO3-1RandomNumberGuessingGame
 */
class inputANumber {
    int getNumber(){
        out.println("Please enter a number:");
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }
}
