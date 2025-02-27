// import java.util.Arrays;
import java.util.Scanner;

// import java.util.Scanner;
// import java.lang.reflect.Array;
// import java.util.*;
public class Arrray {
    public static void main (String args[]){
//        int [] marks = new int[3];
//        marks [0]= 97;
//        marks[1] = 95;
//        marks [2] = 99;

//     //             ((for each loop))
//        for (int val : marks){
//         System.out.println(val);
//        }
//     }
// }

      
    //    Scanner sc = new Scanner(System.in);
    //    System.out.println("enter the size of an array:");
    //    int size = sc.nextInt();
    //    int marks [] = new int [size];
    //    for (int i=0; i<size; i++){
    //     marks[i] = sc.nextInt();
    //    }
    //    for(int i= 0; i <marks.length; i++){
    //     System.out.println("mark "+ (i+1)+" is :"+ marks[i]);
    //         }
    //     }
    //   }




                    //  take the input (names) from user and print them
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of the array");
      int size = sc.nextInt();
      String names [] = new String [size];
      for (int i=0; i<size; i++){
        names [i] = sc.next();
      }
      sc.close();
      for(String value : names ){
        System.out.println(value);
      }
    }
}



                      // print the largest and smallest number from an Array
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the size of numbers:");
//     int size = sc.nextInt();
//     System.out.println("input the numbers");
//     int numbers []= new int [size];
//     for(int i = 0; i<size; i++){
//       numbers[i] = sc.nextInt();
//     }
//     int max= numbers[0];
//     int min= numbers[0];
//     for(int i=0; i<numbers.length; i++){
//       if(numbers[i]<min){
//         min = numbers[i];
//       }
//       if(numbers[i]>max){
//         max = numbers[i];
//       }
//     }
//     System.out.println("largest number is :"+ max);
//     System.out.println("smallest numer is :" + min);
//     System.out.println("Span of the array:"+ (max-min));
// }
// }

