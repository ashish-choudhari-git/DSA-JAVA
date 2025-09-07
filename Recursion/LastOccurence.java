public class LastOccurence {
    static int lastOccurence(int[] arr, int k,int start){
        
        if(start== arr.length){
            return -1;
        }

        if(arr[start]==k){
            return start;
        }

        return lastOccurence(arr,k, start+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,9,6,10};
        System.out.println("position of "+ 6 +" is "+ lastOccurence(arr,6,0));
    }
}


