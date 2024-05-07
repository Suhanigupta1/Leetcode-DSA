class Solution {
    public int maxSubArray(int[] nums) {
        int sum =0;
        int max_sum = 0;
        int n = nums.length;
        for(int i=0; i<n ; i++){
            if(sum < 0 ){
                sum = 0;
            }
            sum += nums[i];
            max_sum = Math.max(max_sum ,sum );
            System.out.print(sum+" ");
        }
        if(max_sum==0){
            int max_ele = -10000;
            for(int i=0; i<nums.length; i++){
                max_ele = Math.max(nums[i], max_ele);
            };
            return max_ele;
        }
        return max_sum;
    }
}