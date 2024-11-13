import java.util.*;
public class Count_LowerCase {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int count1=0;
        int count2=0;
        System.out.println("enter string");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                count1++;
            }
            else if(Character.isUpperCase(s.charAt(i))){
                count2++;
            }
        }
       System.out.println(count1);
        System.out.println(count2);
    }

}
