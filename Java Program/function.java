
import java.util.*;
public class function {
    public static int calculateSum(int a , int b){
       int sum= a+b;
       return sum; 
    }
    public static void main( String []args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int sum = calculateSum(a , b);
        System.out.println("sum of 2 number is:"+ sum);
    }    
}


// class function{
//     public static void checkEvenOdd(int n){
//         if (n%2==0)
//         System.out.println(n+ " is even");
//         else
//         System.out.println(n+ " is odd");
//     }
//     public static void main (String args []){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the integer:");
//         int n = sc.nextInt();
//         checkEvenOdd(n);
//     }
// }