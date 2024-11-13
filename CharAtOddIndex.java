import java.util.*;
public class CharAtOddIndex {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter string");
            String s = sc.nextLine();
            for (int i = 0; i < s.length(); i++) {
                if(i%2!=0)
                {
                    System.out.print(s.charAt(i));
                }
            }
            System.out.println();
        }
    }


