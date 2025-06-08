public class Factorial {
     
    static int factorial(int n){
        int fact;
        if(n==0 || n==1){
            return 1;
        }
        else{
         fact = n * factorial(n-1);
        }
        return fact;
    }

    public static void main(String[] args){
        int fact = factorial(5);
        System.out.println(fact);
    }

}
