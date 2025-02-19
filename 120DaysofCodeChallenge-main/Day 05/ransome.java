// 383. Ransom Note
// Solved
// Easy
// Topics
// Companies
// Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

// Each letter in magazine can only be used once in ransomNote.

 

// Example 1:

// Input: ransomNote = "a", magazine = "b"
// Output: false
// Example 2:

// Input: ransomNote = "aa", magazine = "ab"
// Output: false

import java.util.*;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] a = ransomNote.toCharArray();
        char[] b = magazine.toCharArray(); 
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        int i = 0, j = 0;
        
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                i++; 
            }
            j++; 
        }
    
        return i == a.length;
    }
}
