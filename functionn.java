import java.util.*;
 public class functionn{
//     public static int calculateProduct(int a, int b){
//         return a*b ;

//     }
//     public static void main (String args[]){
//         Scanner x = new Scanner(System.in);
//         int a = x.nextInt();
//         int b = x.nextInt();
//         System.out.println("product of 2 numbers is :"+ calculateProduct(a,b));

//     }
public static void printFactorial(int n){
    int fact = 1;
    for (int i=n; i>=1; i--){
        fact = fact*i;
    }
    System.out.println(fact);
    return;
}
 public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
 printFactorial(a);
 }
}