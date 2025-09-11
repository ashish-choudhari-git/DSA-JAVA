/*
# Tiling Problem
Given a "2 x n" bpard and tiles of size "2 x 1", count the number of
ways to tile the given board using the 2 x 1 tiles.
(A tile can either be placed horizontally or vertically. ) */


public class TilingProblem {

    static int tiling(int n){ // 2 x n (floor)
        if( n ==0  || n ==1) {
            return 1;
        }

        //verticla choice
        int verticalTile = tiling(n-1);

        // horizontal choice
        int horizontalTile = tiling(n-2);

        return verticalTile + horizontalTile; //total ways
    }

    public static void main(String[] args) {
        System.out.println(tiling(1));
    }
    
}
