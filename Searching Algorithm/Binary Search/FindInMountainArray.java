/*
 Leetcode: 1095. Find in Mountain Array

 Time complexity : O(logn) and space complexity : O(1)
 */


public class FindInMountainArray {
    /**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */ 

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,4,2};
        int target = 4;
        System.out.println(findInMountainArray(target,arr));
    }
    static int findInMountainArray(int target, /*MountainArray mountainArr*/ int[] arr) {
        int peak = peakIndex( arr/* mountainArr */);
        int front = binarySearch(arr /* mountainArr */, target, 0, peak, true);
        if (front != -1) return front;
        int back=binarySearch(arr /* mountainArr */, target, peak, arr.length /* mountainArr.length() */ - 1, false);
        if(back!=-1){
            return back;
        }else{
            return -1;
        }
        
    }

    static int binarySearch(int[] arr /* MountainArray mountainArr */, int target, int left, int right, boolean isAsc) {

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midVal = arr[mid] /* mountainArr.get(mid) */;

            if (midVal == target) {
                return mid;
            }

            if (isAsc) {
                if (midVal > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (midVal < target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }

    static int peakIndex( int[] arr /* MountainArray mountainArr */) {
        int left = 0;
        int right = arr.length/*mountainArr.length()*/ - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            int midVal = arr[mid] /*  mountainArr.get(mid)*/;

            if (midVal > arr[mid+1] /* mountainArr.get(mid + 1) */) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        // At the end of the loop, left == right and pointing to peak
        return right;
    }
}

//brute force 
//     for(int i=0;i< mountainArr.length();i++){
//         if(target==mountainArr.get(i)){
//             return i;
//         }
//     }
// return -1;


