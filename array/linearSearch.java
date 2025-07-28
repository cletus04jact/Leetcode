import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numbers []={10,3,6,7,30};
        System.out.println("Array elements" + java.util.Arrays.toString(numbers));
        System.out.println("Eneter the number to search");
        int target = scanner.nextInt();

        for (int i=0;i<numbers.length;i++){
            if(numbers[i]==target){
                System.out.println("The target value found at " + i);
            }
            else{
                System.out.println("The target value not found " );
            }
        }
        
    }

}
