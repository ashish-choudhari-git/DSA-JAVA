/*
 875. Koko Eating Bananas

Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours. Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.

Example 1:
Input: piles = [3,6,7,11], h = 8
Output: 4
Example 2:
Input: piles = [30,11,23,4,20], h = 5
Output: 30

Time Complexity : O(logn) and space complexity : O(1)
 */


public class KokoBananaProblem {
     static  int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = getMax(piles);  // eating speed k will lie between 1 and max value in piles array(as we want minimum)

    while(low<high){
        int mid = low + (high- low)/2;
         if(canEatAll(piles, mid, h)){
            //if this is true means our value is correct , now we find smaller value, which is on left of mid
            high = mid;
         }else{
            low = mid+1;
         }
          // low=high at the end
    }
    return low;
    }

    static boolean canEatAll(int[] arr, int k,int h){
        int hours = 0;
        for (int NoBanana : arr) {
            hours += (NoBanana + k - 1) / k; // ceiling division
        }
        return hours <= h;
    }

    static int getMax(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            if (pile > max) {
                max = pile;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3,6,7,11};
        int h =8;
        System.out.println(minEatingSpeed(arr,h));
    }
}
