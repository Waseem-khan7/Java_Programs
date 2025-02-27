import java.util.Scanner;

public class sumArray {
    public static void main(String args[]){
        Scanner ab= new Scanner (System.in);
        System.out.println("enter the size of first array:");
        int a= ab.nextInt();
        System.out.println("enter the elements of the first arrray");
        int[] arr = new int[a];
        for (int i = 0 ; i<arr.length; i++){
            arr[i] = ab.nextInt();
        }
        System.out.println("enter the size of second array:");
        int b= ab.nextInt();
        int[] arr1 = new int[b];
        for (int i = 0 ; i<arr1.length; i++){
            arr1[i] = ab.nextInt();
        }
        ab.close();
        int sum[] = new int[a];
        for (int i=0; i < a; i++){
            sum[i] = arr[i] + arr1[i];
        }
        for (int val: sum){
            System.out.println(val);
        }
    }
}






































    // System.out.println("Resultant array is :"+ Arrays.toString(sum));