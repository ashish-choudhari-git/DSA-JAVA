public class Add2DMetrix {
    
    public   static void main(String[] args) {

        int[][]first = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][]second = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

    int[][]sum = new int[3][3];
        for(int i=0;i < first.length;i++){
            for(int j=0;j < first[i].length;j++){
                sum[i][j] = first[i][j] + second[i][j];
            }
        }
        
        System.out.println("Sum of two 2D arrays:");
        for(int i=0;i < sum.length;i++){
            for(int j=0;j < sum[i].length;j++){
                System.out.print(sum[i][j] + " ");  
            }
            System.out.println();
        }
    }
}
