import java.util.*;
public class SumOfEvenDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = sc.nextInt();
        while (num > 0) {
            int rem = num % 10;
            if (rem % 2 == 0) {
                sum += rem;
            }
            num = num / 10;
        }
        System.out.println(sum);
    }
}
