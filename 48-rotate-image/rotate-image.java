class Solution {
    public void swap(int[][] matrix, int i , int j, int col){
       int temp = matrix[i][col];
       matrix[i][col] = matrix[j][col];
       matrix[j][col] = temp;  
    }
    public void rotate(int[][] matrix) {
       int n = matrix.length;
       int m = matrix[0].length;
       int mid = n/2;
       if(n%2==0){
          mid = mid-1;
       }
       //reverse the matrix -top down
        for(int i=0; i<=mid; i++){
            for(int k=0 ; k<m; k++){
            System.out.print(matrix[i][k]+":"
            +matrix[n-i-1][k]+",");
            swap(matrix, i , n-i-1, k);
        }
       }
       //col-> row
        for(int i=0; i<n; i++){
          for(int j=i+1 ; j<m; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp; 
            } 
        }
    }
}