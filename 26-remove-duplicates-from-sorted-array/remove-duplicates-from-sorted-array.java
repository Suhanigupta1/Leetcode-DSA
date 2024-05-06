class Solution {
    public int removeDuplicates(int[] nums) {
    HashSet<Integer> temp = new HashSet<Integer>();
    int j=0;
    for(int i = 0; i<nums.length; i++){
        if(temp.contains(nums[i])){
            continue; 
        }else{
            nums[j] = nums[i];
            System.out.print(nums[j]);
            j++;
        }
        temp.add(nums[i]);    
    }        
    return j;
    }
}           
// // 0, 0, 1, 1,1, 2, 2, 3, 3, 4
// // 0, 1 ,1, 1, 1