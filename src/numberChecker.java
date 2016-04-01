import static java.lang.System.out;

/**
 * Created by ross on 3/30/16.
 * Should be used as part of OO3-1RandomNumberGuessingGame
 */
class numberChecker extends numberGenerator {
    private int generatedNumber = super.generatedNumber;

    private void higherOrLower(int enteredNumber){
        if (enteredNumber < generatedNumber) out.println("Too low");
        if (enteredNumber > generatedNumber) out.println("Too high");
    }

    boolean isNumberCorrect(int enteredNumber){
        if (enteredNumber != generatedNumber) {
            higherOrLower(enteredNumber);
            return false;
        } else return true;
    }
}
