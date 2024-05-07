class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result =  new ArrayList<>(); 
        if(numRows==0){
            return result;
        }
        if(numRows==1){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(1);
            result.add(temp);
            return result;  
        }
        result = generate(numRows-1);
        List<Integer> prev = result.get(numRows-2);
        ArrayList<Integer> currRow = new ArrayList<Integer>();
        currRow.add(1);
        for(int k=1; k <numRows-1 ; k++){
            currRow.add(prev.get(k-1)+prev.get(k));
        }

        currRow.add(1);
        result.add(currRow);
        return result;
    }
}


// 1
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1
