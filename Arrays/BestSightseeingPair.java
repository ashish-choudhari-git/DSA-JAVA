/*Leetcode: 1014. Best Sightseeing Pair

You are given an integer array values where values[i] represents the value of the ith sightseeing spot. Two sightseeing spots i and j have a distance j - i between them.
The score of a pair (i < j) of sightseeing spots is values[i] + values[j] + i - j: the sum of the values of the sightseeing spots, minus the distance between them.
Return the maximum score of a pair of sightseeing spots.

Example 1:
Input: values = [8,1,5,2,6]
Output: 11
Explanation: i = 0, j = 2, values[i] + values[j] + i - j = 8 + 5 + 0 - 2 = 11

Time Complexity : O(N)    Space Complexity : O(1)
*/

class BestSightseeingPair{
    static int maxScoreSightseeingPair(int[] values) {
        int max = 0;
        int bestPrev = values[0] + 0;

        for (int j = 1; j < values.length; j++) {
            max = Math.max(max, bestPrev + values[j] - j);
            bestPrev = Math.max(bestPrev, values[j] + j);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr ={12,44,55,66,324};
        System.out.println(maxScoreSightseeingPair(arr));
        
    }
}