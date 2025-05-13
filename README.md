# Dynamic Programming Demo

A demonstration of dynamic programming through memoization in Java.

## Files Included

- **RecursiveScore.java**: Simple recursive implementation with performance measurement
- **README.md**: Repository instructions and explanations

## Setup Instructions

1. Clone this repository:
   ```
   git clone https://github.com/emrgem/dp-demo.git
   ```

2. Navigate to the project directory:
   ```
   cd dp-demo
   ```

3. Compile the code:
   ```
   javac RecursiveScore.java
   ```

4. Run the program:
   ```
   java RecursiveScore
   ```

## Lesson Overview

This repository demonstrates optimization through dynamic programming.
### The Problem

Our recursive function `gameScore(int level)` calculates a player's score based on their level:

```java
public static int gameScore(int level) {
    // Base cases
    if (level <= 0) return 0;
    if (level == 1) return 5;
    
    // Recursive calls
    return 2 * gameScore(level - 1) + gameScore(level - 2);
}
```

### Solution Approach

We'll implement memoization to avoid redundant calculations by:
1. Adding a cache to store calculated results
2. Checking the cache before performing calculations
3. Storing results in the cache after calculation

### Expected Outcomes

After implementing memoization:
- Function calls will be reduced dramatically
- Time complexity will improve
- We'll be able to calculate values that were previously impractical

## Tasks for Students

1. Analyze the original function
2. Add a counter to measure function calls
3. Create a memoized version of the function
4. Compare performance between original and memoized implementations
5. Discuss real-world applications of dynamic programming

## Further Reading

- [Dynamic Programming - Wikipedia](https://en.wikipedia.org/wiki/Dynamic_programming)
- [Memoization - GeeksforGeeks](https://www.geeksforgeeks.org/memoization-1d-2d-and-3d/)
- [Introduction to Dynamic Programming - Topcoder](https://www.topcoder.com/thrive/articles/Dynamic%20Programming:%20From%20Novice%20to%20Advanced)
