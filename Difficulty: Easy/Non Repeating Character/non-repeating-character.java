class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        int freq[] = new int[26];
        for(int i = 0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(freq[s.charAt(i)-'a']==1){
                return ch;
            }
        }
        return '$';
    }
}
