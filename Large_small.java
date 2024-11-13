import java.util.*;
public class Large_small {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n = sc.nextInt();
        int[]arr= new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter integer "+(i+1)+": ");
            arr[i] = sc.nextInt();sc.nextLine();
        }
        Arrays.sort(arr);
        System.out.println("Smallest integer: "+arr[0]);
        System.out.println("Largest integer: "+arr[n-1]);
        }
    }

