import java.util.Scanner;
public class countDigit {


                 /*  count digits in a number((by diving the number 10 again and again ) 
                 (how much times it divides that the count the digits in number))*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int digit = 0;
        while(n != 0){
            n= n / 10;
            digit++;
        }
        System.out.println(digit);
    
  
}
}
