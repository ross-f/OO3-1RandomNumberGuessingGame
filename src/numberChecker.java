import static java.lang.System.out;

/**
 * Created by ross on 3/30/16.
 * Should be used as part of OO3-1RandomNumberGuessingGame
 */
class numberChecker extends numberGenerator {
    private void higherOrLower(int enteredNumber){
        if (enteredNumber < super.generatedNumber) out.println("Too low");
        if (enteredNumber > super.generatedNumber) out.println("Too high");
    }

    // boolean method that returns true if the number entered is correct - the entered number is passed as a parameter
    boolean isNumberCorrect(int enteredNumber){
        // evaluate if entered number does not equal generated number
        if (enteredNumber != super.generatedNumber) {
            higherOrLower(enteredNumber);
            return false;
        } else return true;
    }
}
