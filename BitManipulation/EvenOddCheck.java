public class EvenOddCheck {
    public static void main(String[] args) {
        int n =3;

        if( (n&1) == 0){  //if( (n%2) == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
