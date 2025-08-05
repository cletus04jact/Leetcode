/*
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
 */
public class patternc {

    public static void main(String[] args) {
        int n=5;
        int row,col;
        for(row = n;row >= 1;row--){
            for (col = 1;col <= row;col++){
                System.out.print(col+" " );
            }
            System.out.println("");
        }
    }
}


