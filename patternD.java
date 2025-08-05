/*
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * *
 * * *
 * *
 *
 */
public class patternD {

    public static void main(String[] args) {
        int n=5;
        int row,col;
        for(row =1;row<= 2*n -1;row++){
            int rowChange=row >n?2*n-row:row;
            for (col = 1;col <= rowChange;col++){
                System.out.print(" *" );
            }
            System.out.println("");
        }
    }
}