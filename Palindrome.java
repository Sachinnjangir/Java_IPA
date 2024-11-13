public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        int rev = 0;
        int temp1 = num;

        while (num > 0) {
            int dig = num % 10;
            rev=rev*10+dig;
            num /= 10; // Correct integer division
        }

        if (rev == temp1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
