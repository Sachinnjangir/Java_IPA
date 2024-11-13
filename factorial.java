import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Loop to read and calculate factorials of 5 numbers
        /*for (int j = 0; j < 5; j++) {
            int num = sc.nextInt();
            long fact = 1; // Use long to handle large factorials

            // Calculate factorial
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            // Print the factorial for the current number
            System.out.println(fact);

        }*/
        System.out.println("enter no");
        int num = sc.nextInt();
        long factorial = 1;
        {
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
            System.out.println(factorial);
        }

    }
}

