import java.util.*;

public class loopss {
    public static void main(String args[]){
      /*   Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            /*for (int i = 1; i<11; i++){
                System.out.println(n*i);
            }
            for (int i= 1 ; i<=n; i++){
                if(i%2!=0){
                    System.out.print(i);
                }
                else{
                    System.out.println( );
                }                
            }*/
          /*   for(int i=55 ; i<100;i++ ){
                System.out.println("rukku");
            }*/
            Scanner sc = new Scanner(System.in);
            int input;
            do{
                int marks = sc.nextInt();
                if (marks>=90){
                    System.out.println("this is good");
                }
                else if (marks<=80 || marks>=60){
                    System.out.println("this is  also good");
                }
                else if (marks<=60 || marks >=0){
                    System.out.println("this is good as well");
                }
                else{
                    System.out.println("invalid");
                }
                System.out.println("want to continue");
                input = sc.nextInt();

            }while(input==1);
        }
    }

