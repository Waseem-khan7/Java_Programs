import java.util.Scanner;

public class javaclass{
    public static void main(String[] args) {
    Scanner xyz = new Scanner(System.in);
    int a = xyz.nextInt();
    int b = xyz.nextInt();
    int sum = a+ b;
    System.out.println(sum);
    xyz.close();     
    }
}