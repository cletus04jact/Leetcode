/*
    * 
   **
  ***
 ****
*****
 */
public class patternF {
    public static void main(String[] args) {
        int n=5;
        int row,col,space;
        for (row=1;row<=n;row++){
            for (space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            for (col=1;col<=row;col++){
                System.out.print(row);
            }
            System.out.println(" ");
        }

        }
    }
}
