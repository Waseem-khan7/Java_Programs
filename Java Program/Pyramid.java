public class Pyramid {
    public static void main (String args[]){
        int n = 4;
        int number = 1;

        for (int i= 1; i<= 4; i++){
            for (int j=1; j<=n-1; j++){
                System.out.print("");
            }
            for(int j= 1; j<=i; j++){
                System.out.print(number);
                number = number +1 ;
            }
        }System.out.println();
    }
}
