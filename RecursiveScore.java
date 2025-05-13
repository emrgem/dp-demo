
public class RecursiveScore {
    //Counter for function calls
    private static int counter = 0;

    //Reset counter to zero
    public static void resetCounter() {
        counter = 0;
    }

    //Get current counter value
    public static int getCounter() {
        return counter;
    }

    // Calculate a player's score based on their level.
    public static int gameScore(int level) {
        counter++;
        // Base cases
        if (level <= 0) {
            return 0;
        }
        if (level == 1) {
            return 5;
        }
        // Recursive calls
        return gameScore(level - 1) + gameScore(level - 2);
    }

    //Main method to test the function.
    public static void main(String[] args) {
        // // QUESTION 1: What is the output of gameScore(4)? 
        // System.out.println("===== output of gameScore(4) =====");
        // System.out.println("Level 4: " + gameScore(4));

        // // QUESTION 2: How many total function calls for gameScore(4)?
        // System.out.println("\n===== FUNCTION CALLS FOR gameScore(4) =====");
        // resetCounter();
        // int level = 4;
        // gameScore(level);
        // System.out.println("Level " + level + ": " + counter + " calls");
    }
}
