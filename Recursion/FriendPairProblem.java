public class FriendPairProblem {
    
    static int ways(int n){ // 2 x n (floor)
        if( n ==1  || n ==2) {
            return n;
        }

        //verticla choice
        int single = ways(n-1);

        // horizontal choice
        int paired = (n-1) * ways(n-2);

        return single + paired; //total ways
    }

    public static void main(String[] args) {
        System.out.println(ways(3));
    }
}
