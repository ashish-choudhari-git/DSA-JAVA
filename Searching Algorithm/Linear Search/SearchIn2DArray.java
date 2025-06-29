//Q1: Search an element in 2d array
//Q2: find min and max in 2d array
public class SearchIn2DArray {
    // public static void main(String[] args) {
    //     int[][] arr ={
    //         {1,2,3},{2,6},{3,5,9,32,4}
    //     };
    //     int target = 6;
    //     int[] result = search(arr,target);
    //     if(result[0]==-1){
    //         System.out.println("Element not found");
    //     }else{
    //         System.out.println("Element is found at row:" + result[0]+ " column:"+result[1]);
    //     }
    // }

    // static int[] search(int[][] arr, int target){
    //     for(int row=0; row< arr.length;row++){
    //         for(int col=0;col < arr[row].length;col++){
    //             if(arr[row][col]== target){
    //                 return new int[]{row,col};
    //             }
    //         }
    //     }
    //     return new int[]{-1,-1};
        
    // }

        public static void main(String[] args) {
        int[][] arr ={{1,2,3},{2,6},{3,5,9,32,4} };
        int[] result = search(arr);
        System.out.println("Min :" + result[0]+ " max:"+result[1]);
    
    }

    static int[] search(int[][] arr){
        int min = arr[0][0];
        int max =arr[0][0];
        for(int[] ints: arr){
            for(int element: ints){
                if(max < element){
                    max= element;
                }
                if(min > element){
                    min= element;
                }
            }
        }
        return new int[]{min,max};
    }
}

