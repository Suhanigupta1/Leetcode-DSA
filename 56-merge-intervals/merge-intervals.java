class Solution {
    public int[][] merge(int[][] intervals) {
    List<int[]> result = new ArrayList<>();
    Arrays.sort(intervals, (i, j)->Integer.compare(i[0], j[0]));
    int[] newinterval = intervals[0];
    result.add(newinterval);
    for(int[] interval: intervals){
        if(newinterval[1] >= interval[0]){
            newinterval[1] = Math.max(newinterval[1], interval[1]);
        }else{
            newinterval = interval;
            result.add(newinterval);
           
         
        }
    }
    return result.toArray(new int[result.size()][]);



    }
}