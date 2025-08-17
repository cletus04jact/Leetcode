public class patternH {
    public static void main(String[] args) {
        int n=4;
        int row, col, counts = 1;
        for (row =1;row<=n;row++){
            if (row%2 !=0){
                for(col =n;col>=1;col--){
                    System.out.print(counts++ +" " );
                }
                System.out.println("");
            }
            else{
                for(col=1; col<=n;col++){
                    System.out.print(counts++ +" " );
                }
                System.out.println("");
            }
        }

    }
}
