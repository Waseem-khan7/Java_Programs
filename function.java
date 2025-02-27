
import java.util.*;
// public class function {
//     public static int calculateSum(int a , int b){
//        int sum= a+b;
//        return sum; 
//     }
//     public static void main( String []args){
//         Scanner sc = new Scanner (System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = calculateSum(a , b);
//         System.out.println("sum of 2 number is:"+ sum);


//     }
    
// }
class function{
    public static void checkEven(int n){
        if (n%2==0)
        System.out.println(n+ " is even");
        else
        System.out.println(n+ "is not even");

    }
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the enteger:");
        int n = sc.nextInt();
        checkEven(n);

    }
}