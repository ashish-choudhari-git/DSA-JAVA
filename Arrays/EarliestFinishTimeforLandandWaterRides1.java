/*Leetcode : 3633. Earliest Finish Time for Land and Water Rides I

You are given two categories of theme park attractions: land rides and water rides.
Land rides
landStartTime[i] – the earliest time the ith land ride can be boarded.
landDuration[i] – how long the ith land ride lasts.
Water rides
waterStartTime[j] – the earliest time the jth water ride can be boarded.
waterDuration[j] – how long the jth water ride lasts.
A tourist must experience exactly one ride from each category, in either order.
A ride may be started at its opening time or any later moment.
If a ride is started at time t, it finishes at time t + duration.
Immediately after finishing one ride the tourist may board the other (if it is already open) or wait until it opens.
Return the earliest possible time at which the tourist can finish both rides.

Example 1:
Input: landStartTime = [2,8], landDuration = [4,1], waterStartTime = [6], waterDuration = [3]
Output: 9
Explanation:​​​​​​​
Plan A (land ride 0 → water ride 0):
Start land ride 0 at time landStartTime[0] = 2. Finish at 2 + landDuration[0] = 6.
Water ride 0 opens at time waterStartTime[0] = 6. Start immediately at 6, finish at 6 + waterDuration[0] = 9.
Plan B (water ride 0 → land ride 1):
Start water ride 0 at time waterStartTime[0] = 6. Finish at 6 + waterDuration[0] = 9.
Land ride 1 opens at landStartTime[1] = 8. Start at time 9, finish at 9 + landDuration[1] = 10.
Plan C (land ride 1 → water ride 0):
Start land ride 1 at time landStartTime[1] = 8. Finish at 8 + landDuration[1] = 9.
Water ride 0 opened at waterStartTime[0] = 6. Start at time 9, finish at 9 + waterDuration[0] = 12.
Plan D (water ride 0 → land ride 0):
Start water ride 0 at time waterStartTime[0] = 6. Finish at 6 + waterDuration[0] = 9.
Land ride 0 opened at landStartTime[0] = 2. Start at time 9, finish at 9 + landDuration[0] = 13.
Plan A gives the earliest finish time of 9. */


public class EarliestFinishTimeforLandandWaterRides1 {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n = landStartTime.length;
        int m =waterStartTime.length;
        int minFT= Integer.MAX_VALUE;

        for(int i=0;i< n;i++){
            for(int j=0;j<m;j++){
                //land first
                int LFT = landStartTime[i] + landDuration[i];
                int WST = Math.max( LFT, waterStartTime[j]);
                int WFT = WST + waterDuration[j];
                minFT = Math.min(minFT, WFT);

                //water first 
                int WFTnew = waterStartTime[j] + waterDuration[j];
                int LSTnew = Math.max( WFTnew, landStartTime[i]);
                int LFTnew = LSTnew + landDuration[i];
                minFT = Math.min(minFT, LFTnew);
            }
        }

        return minFT;
    }
}
