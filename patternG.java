public class patternG {
        public static void main(String[] args) {
        int n=5;
        int row,space,star;
        for (row=n;row<=n;row--){
            for (space=0;space<=n-row;space++){
                System.out.print(" ");
            }
            for (star=n;star<=row;star--){
                System.out.print(row);
            }
            System.out.println(" ");
        }

        }
}
