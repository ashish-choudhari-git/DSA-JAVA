/*
Problem: Maximum Subarray Sum (Kadane's Algorithm)
Description: Given an integer array nums, find the contiguous subarray (containing at least one number)
             which has the largest sum and return its sum.
*/
public class MaximumSubarraySum {

    static int maxSubArray(int[] nums) {
        int currentSum = nums[0]; 
        int maxSum = nums[0];     
         
        for(int i =1; i< nums.length;i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum,currentSum);
        }

        return maxSum;
    }

    static int maxSA(int[] nums) {
        int currentSum = 0; 
        int maxSum = Integer.MIN_VALUE;     
         
        for(int i =0; i< nums.length;i++){
            currentSum = currentSum + nums[i];
            if(currentSum <0){
                currentSum =0;
            }
            maxSum = Math.max(currentSum,maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int maxSubarraySum = maxSA(arr);
        System.out.println("Maximum subarray sum is: " + maxSubarraySum);
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)
*/

//better , TC : O(n^2)
// public class MaximumSubarraySum {
//     static int maxSubArray(int[] nums) {
//         int n =nums.length;
//         int[] prefix = new int[n];
//         int maxSum= Integer.MIN_VALUE;
//         int currSum=0;

//         for(int i=0;i<n;i++ ){
//             currSum += nums[i];
//             prefix[i] = currSum;
//         }
        
//         for(int i=0;i<n;i++){

//             for(int j=i;j<n;j++){
//                 int sum = i==0 ? prefix[j] : prefix[j]- prefix[i-1];
//                 if(sum> maxSum){
//                 maxSum = sum;
//                 }
//             }

//         }
//         return maxSum;
//     }

//     public static void main(String[] args) {
        
//         int[] arr = {-2,-3,4,-1,-2,1,5,-3};
//         int maxSubarraySum = maxSubArray(arr);
//         System.out.println("Maximum subarray sum is: " + maxSubarraySum);
//     }
// }

/*
 * TC : O(n^2) and O(n)
 */


//worst solution , TC: O(n^3)
//  static void subarrays(int[] arr){
//         int maxSubArraySum =Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
            
//             for(int j=i;j<arr.length;j++){ 
                
//                 int sum =0;  
//                 for(int k=i;k<=j;k++){
//                     sum+= arr[k];
//                 }

//                 if(sum>maxSubArraySum){
//                     maxSubArraySum =sum;
//                 }
 
//             }
            
//             System.out.println();
//         }
//         return maxSubArraySum;
// }



