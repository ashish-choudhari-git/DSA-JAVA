public class Scope {
    public static void main(String[] args) {
        int a = 5;
        {
             a=3; //if we already deaclared value then we cant declare it again 
            System.out.println("a = " + a); // This will print 3
        }
        System.out.println("a = " + a); // This will print 3 too 
    }
    
}
 