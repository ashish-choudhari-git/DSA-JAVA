import java.util.HashSet;

public class CandyDistribute {
  
    public int distributeCandies(int[] candyType) {
   HashSet<Integer> distinctC = new HashSet<>();
        
        for (int candy : candyType) {
            distinctC.add(candy);
        }
        
        int maxCandiesAllowed = candyType.length / 2;
        int uni = distinctC.size();
       
        if(uni < maxCandiesAllowed){
            return uni;
        }
        else{
            return maxCandiesAllowed;
        }
        
    }
}

