import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            // Convert string to char array, sort it, then convert back
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);  // this is the "signature" of the anagram group

            // Put in map
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }

        // Return all grouped values
        return new ArrayList<>(map.values());
    }
}
