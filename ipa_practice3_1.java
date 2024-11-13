
import java.util.Scanner;
public class ipa_practice3_1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int [] arr= new int[5];
        int sum=0;
        // read value
        for(int i=0;i<5;i++){
            arr[i]= sc.nextInt();
        }
        // calculate sum of odd digit
        for(int i=0;i<5;i++){
            if(arr[i]%2!=0){
                sum=sum+arr[i];
            }
        }
        if (sum>8 && sum<50){
            System.out.println(sum);
        }
        else
            System.out.println("na");
        }
    }
