import java.util.*;
public class average {
    public static float printAverage(int a , int b , int c ){
        float average = (a+b+c)/3;
        return average;

    }
    public static void main (String args[]){
        Scanner ab = new Scanner(System.in);
        int a = ab.nextInt();
        int b = ab.nextInt();
        int c = ab.nextInt();
        ab.close();
        System.out.println("average of three numbers"+printAverage(a,b,c));


    }

    
}




