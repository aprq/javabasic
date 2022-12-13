//Reverse the given number Code........
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter number:");
        int number = n.nextInt();
        int rev = 0;
        while (number > 0) {
            int lastdigit = number % 10;
            rev = (rev * 10) + lastdigit;
            number = number / 10;

        }
        System.out.println(rev);
        n.close();
        
    }
    
    
}
