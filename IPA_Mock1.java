// read int and print true if it contains atleast 3 odd Digits. else false
// eg. 123456 it contains 3 odd digit so it should print true
import java.util.*;
public class IPA_Mock1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int count =0;
        System.out.println("enter no");
        int num= sc.nextInt();
        while (num>0){
            int digit = num%10;
            if (digit%2!=0){
                count++;
            }
            num=num/10;
        }
        if (count>=3){
            System.out.println("true");
        }
        else
            System.out.println("false");
    }
}
