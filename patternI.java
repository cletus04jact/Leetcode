public class patternI {
    public static void main(String[] args)
    {
        int n=5;
        int space,row,col,rowChange,spaceChange;
        for (row=1;row<=n;row++){
            rowChange = row>n ? ((2*n)- row ):  row;
            spaceChange= row >n? (row-n):(n-row);
            for (space=1;space<=spaceChange;space++){
                System.out.print("");
            }
            for (col=1;col<=rowChange ;col++){
                System.out.print("*");
            }
            System.out.println("");

        }
    }

}
