import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        // Check constraints
        if (n < 5 || n % 2 == 0) {
            System.out.println("Size should be odd and at least 5.");
            return;
        }

        int mid = n / 2;

        for (int i = 0; i < n; i++) { // row loop
            for (int j = 0; j < n; j++) { // col loop

                if (
                    i == 0 || i == n - 1 || // top & bottom border
                    j == 0 || j == n - 1 || // left & right border
                    i == j ||               // main diagonal
                    i + j == n - 1 ||       // other diagonal
                    i == mid || j == mid    // plus sign
                ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

       
    }
}
