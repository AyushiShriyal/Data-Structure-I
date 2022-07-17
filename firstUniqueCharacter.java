Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        int answer = -1;
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i)-'a'] += 1;
        }
        for(int i=0; i<s.length(); i++){
            if(count[s.charAt(i)-'a']==1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}