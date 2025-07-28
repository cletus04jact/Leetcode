import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int count =0,i;
        System.out.println("Enter the size of the array");
        int arr[]= new int [scanner.nextInt()];
        for (i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
            
        }
        count=0;
        System.out.println("Enter the element to be counted");
        int target=scanner.nextInt();
        for (int num :arr ){
            if (num==target){
                count +=1;
            }

        }
    }
}
