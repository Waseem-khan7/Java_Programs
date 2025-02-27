// import java.util.Scanner;
// public class number {



//             // reverse a number

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         while(n > 0){
//             int dig= n % 10;
//             n = n/10;
//             System.out.print(dig);
//         }
//         }
//     }

    

              // inverse a number

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("enter the number:");
//         int n = in.nextInt();
//         int inv = 0;
//         int op = 1;
//         while(n != 0){
//             int od = n % 10;
//             int ip = od;
//             int id = op;
            
//             inv = inv + od* (int)Math.pow(10,ip-1);
//             n = n/10;
//             op++;
//         }
//         System.out.println(inv);
        
//     }
// }

                //prime factorization

    // public static void main(String args[]){
    //     Scanner in = new Scanner (System.in);
    //     System.out.println("enter the number:");
    //     int n = in.nextInt();

//         for (int div = 2; div * div <= n; div++){
//                 while(n % div == 0){
//                         n = n / div;
//                         System.out.println(div);
//                 };
//         }
//         if (n != 1){
//                 System.out.print(n);
//         }
//     }
// }

          // Pythagorean Triplet

// public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
        
//         int max = a;
//         if (b >= max){
//                 max = b;
//         }
//         if (c >= max){
//                 max = c;
//         }
//         if (max == a){
//                 boolean flag = ((b * b + c * c) ==(a * a));
//                 System.out.println(flag);
//         }
//         if (max == b){
//                 boolean flag = ((a * a + c * c) ==(b * b));
//                 System.out.println(flag);
//         }
//         if (max == c){
//                 boolean flag = ((b * b + a * a) ==(c * c));
//                 System.out.println(flag);
//         }



//         }
// }


                //Banjamin Bulb
//  public static void main(String args[]){
//     Scanner in = new Scanner (System.in);
//     System.out.println("enter the number:");
//     int n = in.nextInt();
//     for (int i = 1; i * i <= n; i++){
//         System.out.println(i*i);
//     }



//     }
// }
