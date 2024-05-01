import java.util.* ;
import java.io.*; 
import java.lang.*;
class Solution {
    public int rob(int[] nums) {
        ArrayList<Integer> temp1 = new ArrayList<>();
		ArrayList<Integer> temp2 = new ArrayList<>();
		int n = nums.length;
		if(n==0){
			return 0;
		}
		if(n==1){
			return nums[0];
		};
		for(int i=0; i<n ; i++){
			if(i!=0){
				temp1.add(nums[i]);
			}
			if(i!=n-1){
				temp2.add(nums[i]);
			}
		} 
		return Math.max(maxAdjSum(temp1, temp1.size()), 
				  maxAdjSum(temp2, temp2.size()));
		// Write your code here.		
	}	        
	public int maxAdjSum(ArrayList<Integer> nums, int n) {
		int prev2 =0;
		int prev = nums.get(0); 
		for(int i=1; i<n; i++){
			int take = nums.get(i);
		
				take += prev2;
			
			int notTake = prev;
			int curr = Math.max(take, notTake);
			prev2 = prev;
			prev = curr;
		}
		return prev;
	}
}