public class patterns {
    public static void main(String args[]){
        int n =5;
        for(int i=1; i<=n; i++) {
            for(int j=i; j<=n; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++ ){
                System.out.println(j+" ");
            }
            for(int j=i-1; j>=1; j--){
                System.out.println(j+" ");
            }
        }System.out.println();
    }
    
}
