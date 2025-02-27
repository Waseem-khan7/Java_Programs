import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner  in = new Scanner (System.in);
        System.out.println("enter the number :");
        int num = in.nextInt();
        in.close();
        int a = 0;
        int b = 1;
        for (int i=0; i<num; i++){
            System.out.print(a+" ");
            int c= a+b;
            a = b;
            b = c;
        }
    }
}
