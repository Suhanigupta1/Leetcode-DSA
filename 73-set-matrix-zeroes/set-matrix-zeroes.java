// class Solution {
// public void setZeroes(int[][] matrix) {
//     boolean fr = false,fc = false;
//     for(int i = 0; i < matrix.length; i++) {
//         for(int j = 0; j < matrix[0].length; j++) {
//             if(matrix[i][j] == 0) {
//                 if(i == 0) fr = true;
//                 if(j == 0) fc = true;
//                 matrix[0][j] = 0;
//                 matrix[i][0] = 0;
//             }
//         }
//     }
//     for(int i = 1; i < matrix.length; i++) {
//         for(int j = 1; j < matrix[0].length; j++) {
//             if(matrix[i][0] == 0 || matrix[0][j] == 0) {
//                 matrix[i][j] = 0;
//             }
//         }
//     }
//     if(fr) {
//         for(int j = 0; j < matrix[0].length; j++) {
//             matrix[0][j] = 0;
//         }
//     }
//     if(fc) {
//         for(int i = 0; i < matrix.length; i++) {
//             matrix[i][0] = 0;
//         }
//     }
// }
    
// }



class Solution {
    public void setZeroes(int[][] matrix) {
       int col0 = 1;
       int n = matrix.length;
       int m = matrix[0].length;
        for(int i=0; i<n; i++){
            if(matrix[i][0]==0){col0 = 0;};
            for(int j=1; j<m; j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        System.out.print(matrix[n-1][0]);
        for(int row=n-1; row>=0 ; row--){
            for(int col = m-1; col>=1; col--){
                if(matrix[row][0]==0 || matrix[0][col]==0){
                    matrix[row][col]=0;
                }
            }
           
            if(col0==0){
                matrix[row][0]=0;
            }
        }  
    }
}