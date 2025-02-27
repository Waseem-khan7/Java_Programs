import javax.lang.model.util.ElementScanner14;

public class secondLargest {
    public static void main(String[] args) {
        int [] arr = {12,4,56,7,4,67,34,23};
        int fmax = 0;
        int smax = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > fmax){
                smax = fmax;
                fmax = arr[i];
            }
            else if( arr[i] > smax){
                    smax = arr[i];
                } 
        }
        System.out.println("Second Max element is :" + smax);
    }
}
