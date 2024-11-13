import java.util.Arrays;

public class Arrayss {
    public static void main(String[] args){
        int [] marks=new int[4]; //int[] marks = {97,85,90,52};
        marks[0]=97;
        marks[1]=85;
        marks[2]=90;
        marks[3]=52;
        System.out.println(marks[1]);
        System.out.println(marks.length);

        // sort
        Arrays.sort(marks);
        System.out.println(marks[0]);

        int [][] fmarks={{97,95,85,74},{85,96,99,92}};
        System.out.println(fmarks[1][2]);


    }
}
