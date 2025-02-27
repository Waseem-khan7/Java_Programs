import java.util.*;
public class primee {
    public static boolean isPrime(int x ) {
        int i;
        for(i=2; i<=x/2; i++){
            if(x%i==0)
                break;
        }
        return i>x/2;
    }
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int  n = sc.nextInt();
        sc.close();
        if(isPrime (n) )
            System.out.println(n+ "is a prime number");
        else
            System.out.println(n+"is not prime number");
     }

    }

