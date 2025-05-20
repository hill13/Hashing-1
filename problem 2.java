//This approach checks if two strings s and t are isomorphic by ensuring a one-to-one character mapping in both directions
// It uses two HashMaps to track the mappings from s to t and from t to s, verifying at each step that existing mappings are consistent.
//. If any mismatch is found, it returns false; otherwise, it confirms the strings are isomorphic and returns true.


import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (map1.containsKey(sChar)) {
                if (map1.get(sChar) != tChar) {
                    return false;
                }
            } else {
                map1.put(sChar, tChar);
            }

            if (map2.containsKey(tChar)) {
                if (map2.get(tChar) != sChar) {
                    return false;
                }
            } else {
                map2.put(tChar, sChar);
            }
        }

        return true;
    }
}
