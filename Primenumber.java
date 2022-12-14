//TO CHECK IF NUMBER IS PRIME OR NOT........

import java.util.Scanner;
public class Primenumber {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        if (number == 2) {
            System.out.println("number is prime");
        }
        else {
            boolean isPrime = true;
            for (int i = 2; i <= number - 1; i++) 
            //for optimisation we can use i<=Maths.sqrt(n) which will give square root of n 
            {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("number is prime");
            }
            else{
                System.out.println("number is not prime");
            }
        }

    }   

    
}
