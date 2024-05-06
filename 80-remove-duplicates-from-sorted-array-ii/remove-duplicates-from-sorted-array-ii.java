// class Solution {
//     public int removeDuplicates(int[] nums) {
        
//     }
// }
class Solution {
    public int removeDuplicates(int[] nums) {
    HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>();
    int j=0;
    for(int i = 0; i<nums.length; i++){
        if(temp.containsKey(nums[i]) && temp.get(nums[i])>=2){
            continue; 
        }else{
            nums[j] = nums[i];
            System.out.print(nums[j]);
            j++;
        }
        temp.put(nums[i], temp.getOrDefault(nums[i],0)+1);    
    }        
    return j;
    }
}   
// 0,0,1,1,1,1,2,3,3
// 