import java.util.Random;

// this is the class that generates the random number
class numberGenerator {
    // integer to store number
    int generatedNumber;
    // create private variable to store Random object
    private Random random;

    // initialise object with constructor
    numberGenerator() {
        random = new Random();
    }

    // generate new random number when method is called
    void generate(){
        // store random number in integer variable - number is capped at 100
        generatedNumber = random.nextInt(100);
    }
}
