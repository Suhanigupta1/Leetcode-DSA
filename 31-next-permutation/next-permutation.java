class Solution {
    public void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp; 
    }
    public void reverse(int[] nums , int start){
        int i = start;
        int j = nums.length-1;
        while(i < j){
            swap(nums, i , j );
            i++; 
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int one =  -1;
        int two = -1;
        int n = nums.length;
        for(int k= n-2  ;k >=0 ; k--){
            if(nums[k]<nums[k+1]){
                one = k;
                break;
            }
        }
        if(one == -1){
            reverse(nums, 0);
        }else{
            for(int k = n-1; k>=0; k--){
                if(nums[k] > nums[one]){
                    two = k;
                    break;
                }
            }
            swap(nums, one, two);
            reverse(nums,one+1);
        }       
    }
}