class Solution {
    public int longestConsecutive(int[] nums) {
    HashSet<Integer> ans =  new HashSet<Integer>();
    for(int i=0; i<nums.length; i++){
        ans.add(nums[i]);
    }

    int maxLen = 0;
    for(int i=0; i<nums.length; i++){
        int len =0;
        int start = nums[i];
        if(!ans.contains(nums[i]-1)){  
            // System.out.print(start+" ");
            while(ans.contains(start)){
                // System.out.print(start+" ");
                start++;
                len++;
            }
        }
        maxLen = Math.max(maxLen, len);
    }         
    return maxLen;
    }
}