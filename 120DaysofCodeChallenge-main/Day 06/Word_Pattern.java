
// Testcase
// Testcase
// Test Result
// 290. Word Pattern
// Solved
// Easy
// Topics
// Companies
// Given a pattern and a string s, find if s follows the same pattern.

// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:

// Each letter in pattern maps to exactly one unique word in s.
// Each unique word in s maps to exactly one letter in pattern.
// No two letters map to the same word, and no two words map to the same letter.
 

// Example 1:

// Input: pattern = "abba", s = "dog cat cat dog"

// Output: true

// Explanation:

// The bijection can be established as:

// 'a' maps to "dog".
// 'b' maps to "cat"

import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String []str= s.split("\\s+");
        if(str.length!=pattern.length()){
            return false;
        }
        int c=0;
        Map<Character,String>map = new HashMap<>();
        
        for(int i=0;i<pattern.length();i++){
            String word = str[i];
            Character ch = pattern.charAt(i);
            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(word)) {
                    return false;
                }
            } else {
                if (map.containsValue(word)) {
                    return false; 
                }
                map.put(ch, word);
            }
        }
        return true;
    }
}