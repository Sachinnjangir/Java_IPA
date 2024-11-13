import java.util.*;
public class Count_word {
    //Count number of word in a string
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int count=0;
        System.out.println("enter string");
        String s= sc.nextLine();
        String[] arr=s.split(" ");
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=" "){
                count++;
            }
        }
        System.out.println(count);
    }
}

