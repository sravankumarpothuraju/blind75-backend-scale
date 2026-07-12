package arraysandhashing.validanagram;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {

            return false;
        }

        if (s.isBlank() || t.isBlank()) {
            return false;
        }


        for (int i = 0; i < s.length(); i++) {
            int countOfS = 0;
            int countOfT = 0;

            char targetChar = s.charAt(i);


            for (int j = 0; j < s.length(); j++) {

                if (targetChar == s.charAt(j)) {

                    countOfS++;
                }
            }


            for (int k = 0; k < t.length(); k++) {

                if (targetChar == t.charAt(k)) {

                    countOfT++;
                }
            }


            if (countOfT != countOfS) {

                return false;
            }

        }

        return true;
    }
}
