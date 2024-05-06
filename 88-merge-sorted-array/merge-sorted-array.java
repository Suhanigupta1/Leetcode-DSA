class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[nums1.length];
        int s = 0;
        int e = 0 ; 
        int k =0;
        while(s<=m-1 && e<= n-1){
            if(nums1[s] <= nums2[e]){
                temp[k] = nums1[s];
                k++;
                s++;
            }else{
                temp[k] = nums2[e];
                k++;
                e++;
            }
        }
        while(s<=m-1){
            temp[k]=nums1[s];
            k++;
            s++;
        }   
        while(e<=n-1){
            temp[k] = nums2[e];
            k++;
            e++;
        }
        for(int l=0; l < nums1.length ; l++){
            nums1[l] = temp[l];
        }
    }
}