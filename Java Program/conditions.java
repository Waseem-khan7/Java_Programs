import java.util.Scanner;

public class conditions{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    int a = sc.nextInt();
    System.out.println("enter second number");
    int b = sc.nextInt();
    System.out.println("please select operator");
    int operator = sc.nextInt();
    switch(operator){
        case 1:System.out.println(a+b);
        break;
        case 2: System.out.println(a-b);
        break;
        case 3: System.out.println(a*b);
        break;
        case 4: if(b==0){
            System.out.println("not divided by zero");
        }
            else {
               System.out.println(b/a);
        } 
        break;
        case 5:System.out.println(a%b);
        break;
        default: System.out.println("Invalid operator");
        sc.close();
    }
}
}
    
        
