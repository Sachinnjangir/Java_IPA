import java.util.*;
public class SumEven {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int [] num= new int[5];
        int sum=0;
        for (int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
            if (num[i]%2!=0){
                sum+=num[i];
            }
        }
        System.out.println(sum);
    }
}
