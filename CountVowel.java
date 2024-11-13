import javax.swing.*;
import java.util.*;
public class CountVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int vowel=0;
        int cons=0;
        System.out.println("Enter String");
        String s=sc.nextLine();
        for (int i=0;i<s.length();i++){
            //if (Character.isLetter(s.charAt(i))){
                if(s.charAt(i)=='A'||s.charAt(i)=='a'||s.charAt(i)=='E'||s.charAt(i)=='e'||s.charAt(i)=='I'||s.charAt(i)=='i'||s.charAt(i)=='O'||s.charAt(i)=='o'||s.charAt(i)=='U'||s.charAt(i)=='u')
                {
                    vowel++;
                }
                else{
                    cons++;}
            }
        //}
        System.out.println("Vowels:"+vowel);
        System.out.println("Consonents:"+cons);
    }

}
