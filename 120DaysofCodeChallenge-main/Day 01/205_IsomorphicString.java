// 205. Isomorphic Strings
// Solved
// Easy
// Topics
// Companies
// Given two strings s and t, determine if they are isomorphic.

// Two strings s and t are isomorphic if the characters in s can be replaced to get t.

// All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself
import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> ms = new HashMap<>();
        Map<Character, Character> mt = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char cms = s.charAt(i);
            char cmt = t.charAt(i);
            if (ms.containsKey(cms)) {
                if (ms.get(cms) != cmt) {
                    return false;
                }
            } else {
                ms.put(cms, cmt);
            }
            if (mt.containsKey(cmt)) {
                if (mt.get(cmt) != cms) {
                    return false;
                }
            } else {
                mt.put(cmt, cms);
            }
        }

        return true;
    }
}
