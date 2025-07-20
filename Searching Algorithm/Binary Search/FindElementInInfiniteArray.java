/*
-------Finding position of element in sorted infinite array.

Approach:we will use binary search, as array is sorted. 
-We cant able to solve by using array.length because array is infinite.

-Brute force : Search target element by Linear Search
-Optimal approach:
---just like in binary searhc we divide search space by half , Here we will start with 2 element and iteratively double the seearching spcae, so inidrectly it will take "logn" steps. We check if arr[end] == target if not, we won't call binarySearch(), we will move to next window in whcih that particular element lies.

Time Complexity : O(logn) and Space Complexity : O(1)
*/

public class FindElementInInfiniteArray {
    public static void main(String[] args) {
        int[] arr ={11,22,33,44,55,77,88,99,100,299,322,677,700,900,1000};
        ArrayReader reader = new ArrayReader(arr); //object 
        int target =1000;
        System.out.println(ans(reader,target));

    }
    
    static int ans(ArrayReader reader, int target){
        int start = 0;
        int end =1;

        while(target > reader.get(end)){
            int temp = end +1; //for newStart we want previous end

            end = end + (end-start + 1) * 2; //for new end we wanted previous start , end will be previous end + new window size(which is double of previous window)

            start = temp;// at last,we use temp(newStart)

        }
        return binarySearch(reader,target,start,end);
    }
  
    static int binarySearch(ArrayReader reader, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < reader.get(mid)) {
                end = mid - 1;
            } else if (target > reader.get(mid)) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}


class ArrayReader {
    private int[] arr;

    public ArrayReader(int[] arr) {
        this.arr = arr;
    }

    public int get(int index) {
        if (index >= arr.length) {
            return Integer.MAX_VALUE;
        }
        return arr[index];
    }
}