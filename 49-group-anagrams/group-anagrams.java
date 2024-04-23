class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null && strs.length==0){
            return new ArrayList<>();
        }
        Arrays.sort(strs);
        HashMap<String, ArrayList<String>> ans = new HashMap<>();
        for(String str: strs){
            int[] ch = new int[26];
            for(char ch2 :str.toCharArray()){
                ch[ch2-'a']++;
            }
            String keystr = Arrays.toString(ch);
            if(!ans.containsKey(keystr)){
                ans.put(keystr, new ArrayList<>());
            }
            ans.get(keystr).add(str);
        }
        return new ArrayList<>(ans.values());
    }
}