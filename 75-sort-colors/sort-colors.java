class Solution {
    public void sortColors(int[] nums) {
        sortColor(nums);
    }
    public void sortColor(int[] A) {
       if(A==null || A.length<2) return;
       int low = 0; 
       int high = A.length-1;
        int i =0;
        while(i<=high) {
           if(A[i]==0) {
              // swap A[i] and A[low] and i,low both ++
              int temp = A[i];
              A[i] = A[low];
              A[low]=temp;
              i++;low++;
           }else if(A[i]==2) {
               //swap A[i] and A[high] and high--;
              int temp = A[i];
              A[i] = A[high];
              A[high]=temp;
              high--;
           }else {
               i++;
           }
       }
    }
}