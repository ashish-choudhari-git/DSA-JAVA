public class P1 {
    public static void main(String[] args) {

/*        (1)
*
* *
* * *
* * * *
*/
        // for(int i=0;i<4;i++){
        //     for(int j=0;j<i+1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    


/*         (2)
* * * * 
* * * 
* * 
*
*/

        // for(int i=1;i<=4;i++){
        //     for(int j=4;j>=i;j--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

/*         (3)
 1
 12
 123
 1234
 */
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

/*         (4)
 A
 BC
 DEF
 GHIJ
 */
        // int n=4;
        // char c='A';

        // for(int line = 1 ; line <= n ; line++ ){
        //     for(int character = 1; character <= line; character++){
        //         System.out.print(c++);
        //     }
        //     System.out.println();
        // }


/*         (5)
* * * * *
*       *
*       * 
* * * * * 
 */
        // int trow=4;
        // int tcol =5;
        // for(int row = 1 ; row <= trow ; row++ ){
        //     for(int col = 1; col <= tcol; col++){
        //         if(row==1 || row==trow || col==1 || col==tcol){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
                
        //     }
            
        //     System.out.println();
        // }

/*         (6)
    *
   **
  ***
 ****
          */

        // int n=4;
        // for(int i = 1 ; i <= n ; i++ ){
        //     for(int j = 1; j <= n-i; j++){
        //        System.out.print(" ");
        //     }
        //     for(int j = 1; j <= i; j++){
        //        System.out.print("*");
        //     }
            
        //     System.out.println();
        // }

/*         (7)
12345
1234
123
12
1
*/

        // int n=5;
        // for(int i = 1 ; i <= n ; i++ ){
        //     for(int j = 1; j <= n-i+1; j++){
        //        System.out.print(j);
        //     }
            
        //     System.out.println();
        // }

/*         (8)
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/

        // int n=5;
        // int res=1;
        // for(int i = 1 ; i <= n ; i++ ){
        //     for(int j = 1; j <=i; j++){
        //        System.out.print(res++ +" ");//first use then increment
        //     }
            
        //     System.out.println();
        // }

/*         (9)
1
01
010
1010
10101
*/

        // int n=5;
        // int res=1;
        // for(int i = 1 ; i <= n ; i++ ){
        //     for(int j = 1; j <=i; j++){
        //        System.out.print(res);
        //        res =res==0?1:0;
        //     }
            
        //     System.out.println();
        // }

/*         (10)
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
*/

        // int n=4;
        // for(int i = 1 ; i <= n ; i++ ){
        //     //star
        //     for(int j = 1; j <=i; j++){
        //        System.out.print("*");
        //     }
        //     //spaces
        //     for(int j =1; j<=2*(n-i); j++){
        //        System.out.print(" ");
        //     }
        //     //star
        //     for(int j = 1; j <=i; j++){
        //        System.out.print("*");
        //     }

        //     System.out.println();
        // }
        // //for inverting pattern ,just reverse execution Ex. 1 to 10 then 10 to 1
        
        //  for(int i=n;i>=1;i-- ){
        //     //star
        //     for(int j = 1; j <=i; j++){
        //        System.out.print("*");
        //     }
        //     //spaces
        //     for(int j =1; j<=2*(n-i); j++){
        //        System.out.print(" ");
        //     }
        //     //star
        //     for(int j = 1; j <=i; j++){
        //        System.out.print("*");
        //     }

        //     System.out.println();
        // }

/*         (11)
Solid rhombus
    *****
   *****
  *****
 *****
*****
*/

        // int n=7;
        // for(int i = 1 ; i <= n ; i++ ){
        //     //spaces
        //     for(int j =1; j<=n-i; j++){
        //        System.out.print(" ");
        //     }
            
        //     //star
        //     for(int j = 1; j <=n; j++){
        //        System.out.print("*");
        //     }

        //     System.out.println();
        // }

/*          (12)
Solid rhombus
    *****
   *   *
  *   *
 *   *
*****
*/

        int n=7;
        for(int i = 1 ; i <= n ; i++ ){
            //spaces
            for(int j =1; j<=n-i; j++){
               System.out.print(" ");
            }
            
            //star
            for(int j = 1; j <=n; j++){
                if(i==1 || i== n || j==1 || j==n){ //hollow rectangle code
                 System.out.print("*");
                }else{
                 System.out.print(" "); 
                }
            }
            

            System.out.println();
        }

    }
}