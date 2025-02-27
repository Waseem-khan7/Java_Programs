import java.util.Scanner;
public class printIndex {
    public static void main(String args[]){
        Scanner ab = new Scanner(System.in);
        System.out.println("enter the length of an array:");
        int n = ab.nextInt();
        int arr[]= new int[n];
        for(int i =0; i<n; i++){
            arr[i]= ab.nextInt();
        }
        int index = -1;
        int data = ab.nextInt();
        for (int i=0; i<n; i++){
            if(arr[i]== data){
                index = i;
            break;
        }
        }
        System.out.println("Index of the data element is :" + index);
        }
    }

