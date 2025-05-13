public class RecursiveScore {
    // Calculate a player's score based on their level.
    public static int gameScore(int level) {
        // Base cases
        if (level <= 0) return 0;
        if (level == 1) return 5;
        
        // Recursive calls
        return 2 * gameScore(level - 1) + gameScore(level - 2);
    }
    
    //Main method to test the function.
    public static void main(String[] args) {
        // Calculate and show scores for levels 1-4
        System.out.println("===== GAME SCORE VALUES =====");
        System.out.println("Level 4: " + gameScore(4));
    }
}
