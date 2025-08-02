public class SubArrays {
    static void subarrays(int[] arr){
        int minSubArraySum =Integer.MAX_VALUE;
        int maxSubArraySum =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            
            for(int j=i;j<arr.length;j++){ 

                int sum =0;  
                for(int k=i;k<=j;k++){
                    sum+= arr[k];
                    System.out.print(arr[k]);
                }

                if(sum>maxSubArraySum){
                    maxSubArraySum =sum;
                }
                if(sum<minSubArraySum){
                    minSubArraySum =sum;
                }

                System.out.println();  
            }
            
            System.out.println();
        }

        System.out.println("min:" + minSubArraySum);
        System.out.println("max:" + maxSubArraySum);
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        subarrays(arr);
    }
}

