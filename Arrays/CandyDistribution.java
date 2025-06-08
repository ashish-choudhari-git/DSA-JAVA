/*
  Problem: Distribute Candies
  Description: Alice has n candies, where the ith candy is of type candyType[i]. Alice noticed that she started
               to gain weight, so she visited a doctor. The doctor advised Alice to only eat n/2 of the candies
               she has (n is always even). Alice likes her candies very much, and she wants to eat the maximum
               number of different types of candies while still following the doctor's advice.
  
  Approach: Use HashSet to count unique candy types and return minimum of unique types and n/2
 */

import java.util.HashSet;

public class CandyDistribution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> distinctCandies = new HashSet<>();
        
        for (int candy : candyType) {
            distinctCandies.add(candy);
        }
        
        int maxCandiesAllowed = candyType.length / 2;
        int uniqueTypes = distinctCandies.size();
        
        return Math.min(uniqueTypes, maxCandiesAllowed);
    }
    
    public static void main(String[] args) {
        CandyDistribution solution = new CandyDistribution();
        int[] candyType = {1, 1, 2, 2, 3, 3};
        System.out.println("Maximum number of different types of candies Alice can eat: " + 
                          solution.distributeCandies(candyType));
    }
} 
/*  Time Complexity: O(n) where n is the length of candyType array
  Space Complexity: O(n) for storing unique candy types in HashSet */