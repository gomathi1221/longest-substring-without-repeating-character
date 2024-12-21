class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=0;
        for(int i=0;i<s.length();i++){
            HashSet<Character>h=new HashSet<>();
            for(int j=i;j<s.length();j++){
                if(h.contains(s.charAt(j))){
                    break;
                }
                h.add(s.charAt(j));
            }
            len=Math.max(len,h.size());
        }
        return len;
    
    }
}