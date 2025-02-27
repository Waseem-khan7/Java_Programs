public class luckyNumberInMatrix {
    class Solution {
        public List <Integer> luckyNumbers (int[][] matrix) {
            ArrayList<Integer> result = new ArrayList<>();
            int n = matrix.length;
            int m = matrix[0].length;
            for(int i=0; i<n; i++){
                int min = Integer.MAX_VALUE;
                int index = -1;
                for(int j=0; j<m; j++){
                    if(matrix[i][j] < min)
                    min = matrix[i][j];
                    index = j;
                }
                boolean isTrue = true;
                for(int row=0; row<n; row++){
                    if(matrix[row][index] > min)
                    isTrue = false;
                }
                 if(isTrue = true)
                result.add(min);
            }
            return result;
        }
    }
            
}
