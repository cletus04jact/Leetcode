
import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        int i;
        System.out.println("Enter the size of the array:");
        int arr[]= new int[num.nextInt()];
        System.out.println("Enter the elements of the array:");
        for(i=0;i<arr.length;i++){
            arr[i]=num.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
        }

    }
}
