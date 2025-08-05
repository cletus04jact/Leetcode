/*
*
**
***
****
***** 
*/
public class patternA {

    public static void main(String[] args) {
        int n=5;
        int row,col;
        for(row = 1; row <= n; row++){
            for (col = 1; col <= n - row + 1; col++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
