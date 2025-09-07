public class NthFiboNumber {
    //using recursion
    static int nthFibo(int n){
        if(n ==0){
            return 0;
        }

        if(n==1){
            return 1;
        }

        return nthFibo(n-1)+ nthFibo(n-2);
    }
    
    //using normal for loop
    public static void main(String[] args) {
        System.out.println("Nth term is : "+ nthFibo(5));
    }

    // //using normal for loop
    // public static void main(String[] args) {
    //     int n = 5;

    //     int i=0;
    //     int j=1;
    //     for(int count =2;count < n; count++){
    //         int temp =i+j;
    //         i=j;
    //         j= temp;
    //     }

    //     System.out.println("Nth term is : "+ ( (n== 1) ? i: j));
    // }
}
