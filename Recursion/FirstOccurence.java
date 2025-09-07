public class FirstOccurence {
    static int firstOccurence(int[] arr, int k,int start){
        int ans;
        if(start== arr.length){
            return -1;
        }

        if(arr[start]==k){
            ans= start;
        }

        ans =firstOccurence(arr,k, start+1);

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,9,10};
        System.out.println("position of "+ 6 +" is "+ firstOccurence(arr,6,0));
    }
}
