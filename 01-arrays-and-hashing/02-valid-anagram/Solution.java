package arraysandhashing.validanagram;

import java.util.HashMap;

public class Solution {
    public boolean isAnagram(String s, String t) {
        // 1. Defensive length check
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        // 2. Blank check
        if (s.isBlank() || t.isBlank()) {
            return false;
        }

        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        // 3. Populate frequency map for string s
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            mapS.put(c, mapS.getOrDefault(c, 0) + 1);
        }

        // 4. Populate frequency map for string t
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }

        // 5. Compare both maps (Java's .equals compares key-value pairs)
        return mapS.equals(mapT);
    }
}
