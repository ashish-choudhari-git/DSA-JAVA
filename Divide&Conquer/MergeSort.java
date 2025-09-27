class MergeSort{
    static void mergeSort(int[] arr, int si, int ei){
        //base
        if(si>= ei){
            return;
        }

        //kaam
        int mid = si + (ei-si)/2;
        
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);

        merge(arr, si ,mid, ei);
    }

    static void merge(int[] arr, int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;    //iterator for left arr
        int j= mid+1; //iterator for right arr
        int k =0; //iterator for temp arr


        while(i<= mid && j<= ei){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }

        //for remaining elem of left arr
        while(i<=mid){
            temp[k++] = arr[i++];
        }

        //for remaining elem of right arr
        while(j<=ei){
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
             arr[i] = temp[k];
        }
    }

    static void printArr(int[] arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,0,2,8,4,9,2};
        printArr(arr);
        System.out.println("");
        mergeSort(arr,0,arr.length-1);
        printArr(arr);
    }
}