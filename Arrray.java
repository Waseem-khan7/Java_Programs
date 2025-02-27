import java.util.Scanner;

import java.util.*;
public class Arrray {
    public static void main (String args[]){
       // int [] marks = new int[3];
       // marks [0]= 97;
       //marks[1] = 95;
       //marks [2] = 99;
      //  Scanner sc = new Scanner(System.in);
      //  int size = sc.nextInt();
      //  int marks[] = new int [size];
      //  for (int i=0; i<size; i++){
      //   marks[i] = sc.nextInt();
      //  }
      //  for(int i= 0; i<size; i++){
      //   System.out.println("marks"+ (i+1)+"is :"+ marks[i]);
      //       }
                 //Scanner sc = new Scanner(System.in);
    //   int size = sc.nextInt();
    //   String names [] = new String [size];
    //   for (int i=0; i<size; i++){
    //     names [i] = sc.nextLine();
    //   }
    //   for (int i=0; i<names.length; i++)
    //   System.out.println("names" + (i+1) +"is :"+ names[i]);
    // }


    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int numbers []= new int [size];
    for(int i = 0; i<size; i++){
      numbers[i] = sc.nextInt();
    }
    int max= numbers[0];
    int min= numbers[0];
    for(int i=0; i<numbers.length; i++){
      if(numbers[i]<min){
        min = numbers[i];
      }
      if(numbers[i]>max){
        max = numbers[i];
      }
    }
    System.out.println("largest number is :"+ max);
    System.out.println("smallest numer is :" + min);
}
}
