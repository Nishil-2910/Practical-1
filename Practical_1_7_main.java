// Name :- Nishil
// Roll-no :-21ce101
// Aim :-Display numbers in a pyramid pattern.
//                  1
//                1 2 1
//              1 2 4 2 1
//            1 2 4 8 4 2 1
//          1 2 4 8 16 8 4 2 1
//        1 2 4 8 16 32 16 8 4 2 1
//      1 2 4 8 16 32 64 32 16 8 4 2 1
//    1 2 4 8 16 32 64 128 64 32 16 8 4 2 1 
// Git-hub repository: https://github.com/006Darsh/java-Assaignment-1
import java.util.*;

public class Nishil1_7main {
public static void main(String[] args)
        {
            int nrow;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number one less than the number rows you want in pyramid :");
            nrow = s.nextInt();
            Nishil1_7 d7 = new Nishil1_7(nrow);//calls the contructor of the class file
        }
}
