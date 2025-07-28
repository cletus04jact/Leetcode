
import java.util.Arrays;

// tostring - prints array as list 
public class initz{
    public static void main(String[] args) {
 
        int n[]={2,4,6,8,10};
        System.out.println(n);
        //Wrapper class without for loop
        System.err.println(Arrays.toString(n));
        //Normal print
        for (int num:n){
            System.out.print(num +" ");
        }

    }
}