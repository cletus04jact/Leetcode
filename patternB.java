/*
5 5 5 5 5 
4 4 4 4 
3 3 3 
2 2 
1 
 */
public class patternB {
    public static void main(String[] args) {
        int n=5;
        int row,col;
        for(row = n;row >= 1;row--){
            for (col = 1;col <= row;col++){
                System.out.print(row );
            }
            System.out.println("");
        }
    }
}
