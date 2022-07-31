// Name :- Nishil
// Roll-no :-21ce10
// Aim :-Given a string, return a string made of the first 2 chars (if present), however include 
// first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" 
// yields "oz".
// startOz("ozymandias") → "oz"
// startOz("bzoo") → "z"
// startOz("oxx") → "o"
import java.util.*;
public class Nishil1_2main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String A=sc.nextLine();
Nishil1_2 d2 = new Nishil1_2(A);//calls the constructor of the class file
        sc.close();
    }
}

