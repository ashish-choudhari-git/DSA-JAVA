/* TakeUForward(Tuf) : Union of Two Sorted Arrays

Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays. The union of two arrays can be defined as the common and distinct elements in the two arrays.NOTE: Elements in the union should be in ascending order.

Brute force: stand on arr1, (binary or linear search) in entire arr2 for that element ,if same element then append to arrayList, then next element of arr1 and so on

Optimal approach: 

*/

// import java.util.ArrayList;


// public class UnionOfTwoSortedArray {

//     static ArrayList union(int[] arr1, int[] arr2){

//         ArrayList<Integer> result = new ArrayList<>();

//         for(int i=0;i<arr1.length;i++){
//             for(int j=0;i<arr2.length;j++){
//                 if(arr[i]==arr[j]){
//                     result.add(arr[i]);
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr1 ={1,2,3,4,5,6,7,8};
//         int[] arr2 ={2,3,4,5,9,11,12};
//         System.out.println(union(arr1, arr2));
//         }
// }
