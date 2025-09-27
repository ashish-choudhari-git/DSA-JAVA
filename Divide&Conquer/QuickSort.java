public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6,7,2,0,3,7,2};
        printArr(arr);
        System.out.println("");
        quickSort(arr,0, arr.length-1);
        printArr(arr);
    }

    static void printArr(int[] arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    static void quickSort(int[] arr, int si, int ei){
        //base
        if(si >= ei ){
            return;
        }

        //kaam
        int pivotIdx = partition(arr,si,ei);
        quickSort(arr, si, pivotIdx-1);
        quickSort(arr, pivotIdx+1,ei);
    }

    static int partition(int[] arr, int si, int ei){
        int pivot = arr[ei];
        int i = si-1;

        for(int j=si; j< ei;j++){ //arr[ei] jo ki pivot hai , usko touch nahi karre
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }
}
