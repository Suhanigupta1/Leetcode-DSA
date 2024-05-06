class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                temp.add(nums[i]);
            }
        }
        Collections.sort(temp);
        for(int i=0; i<nums.length; i++){
            if(i<temp.size()){
                nums[i] = temp.get(i);
            }else{
                nums[i] = -1;
            }
        }
        return temp.size();
    }
}