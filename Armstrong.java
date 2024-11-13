public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int sum = 0;
        int temp1 = num;

        while (num > 0) {
            int dig = num % 10;
            sum += Math.pow(dig, 3); // Correct exponentiation
            num /= 10; // Correct integer division
        }

        if (sum == temp1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
