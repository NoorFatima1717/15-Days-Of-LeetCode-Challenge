class Solution {
    public boolean isAnagram(String s, String t) {

        // If lengths differ, they can't be anagrams  
        if (s.length() != t.length()) {
            return false;
        }

        // For lowercase a–z, we use an array of size 26  
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;   // increment for s
            count[t.charAt(i) - 'a']--;   // decrement for t
        }

        // If all counts return to 0, it’s an anagram
        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }
}
