import java.util.Scanner;

public class Condition{
    public static void main (String args[]){
        Scanner xy = new Scanner(System.in);
        System.out.println("enter the age of the girl:");
        int a = xy.nextInt();
        xy.close();
        if(a>18){
            System.out.println("girl is eligible for vote");
        }
        else {
                System.out.println("girl is not eligible for vote");
               }
    }
}