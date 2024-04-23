class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        if( words==null || s==null || s.length() == 0 || words.length == 0){
            return new ArrayList<Integer>();
        }
        HashMap<String , Integer> hm = new HashMap<String, Integer>();
        for(int i=0; i<words.length; i++){
            hm.put(words[i], hm.getOrDefault(words[i], 0)+1);
        }        
        int slen = s.length();
        int num = words.length;
        int len = words[0].length();
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i =0; i<slen - num*len + 1; i++){
            HashMap<String , Integer> seen = new HashMap<String, Integer>();
            int j=0;
            while(j<num){
                String str =  s.substring(i+j*len, i+(j+1)*len);            
                if(hm.containsKey(str)){
                    seen.put(str, seen.getOrDefault(str, 0)+1);
                    if(hm.getOrDefault(str, 0) < seen.get(str)){
                        break;
                    }
                }else{
                    break;
                }
                j++;
            }
             if(j==num){
                arr.add(i);
            }
        }
        return arr;
    }
}