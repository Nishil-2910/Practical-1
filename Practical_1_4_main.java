// Name :- Nishil Patel
// Roll-no :-21ce101
//  Aim :-Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the 
// array somewhere.
// array123([1, 1, 2, 3, 1]) → true
// array123([1, 1, 2, 4, 1]) → false
// array123([1, 1, 2, 1, 2, 3]) → true
import java.util.*;
public class Nishil1_4main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the no of elements you want to be in array :");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array :");
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        Nishil1_4 d4 = new Nishil1_4(arr,n);//calls constructor of class file
        s.close();
    }
}
