class Solution {
    //abcabcbb    string - bca 
    //len -1 2 3 3 
    //maxlen- 3
    public int lengthOfLongestSubstring(String s) {
    HashSet<Character> hs = new HashSet<Character>();
    int max_len = 0;
    int len = 0;
    int i=0;
    int j=0;
    int n = s.length();
    while(i<n && j<n){
        char ch = s.charAt(j);
        while(hs.contains(ch)){
            char val = s.charAt(i); 
            hs.remove(val);
            i++;
            len--;
        }
        hs.add(ch);
        len++;
        j++;
        max_len = Math.max(max_len, len);
    }
    return max_len;
    }   
}