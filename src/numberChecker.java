import static java.lang.System.out;

// this class is used to check value of value of an entered number against a generated number
// this class extends the numberGenerator cla
class numberChecker extends numberGenerator {
    // method that you pass the entered number too and it will output if it's too high or too low
    private void higherOrLower(int enteredNumber){
        if (enteredNumber < super.generatedNumber) out.println("Too low");
        if (enteredNumber > super.generatedNumber) out.println("Too high");
    }

    // boolean method that returns true if the number entered is correct - the entered number is passed as a parameter
    boolean isNumberCorrect(int enteredNumber){
        if (enteredNumber < 0) return false;
        // evaluate if entered number does not equal generated number
        else if (enteredNumber != super.generatedNumber) {
            // method that outputs if the number is too high or too low
            higherOrLower(enteredNumber);
            // return that the number is not correct
            return false;
        }
        // return that the number is correct
        return true;
    }
}
