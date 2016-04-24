import java.util.Random;

/**
 * Created by ross on 3/30/16.
 * Should be used as part of OO3-1RandomNumberGuessingGame
 *
 */
 class numberGenerator {
    int generatedNumber;
    Random random;

    numberGenerator() {
        random = new Random();
    }

    void generate(){
        generatedNumber = random.nextInt(100);
    }
}
