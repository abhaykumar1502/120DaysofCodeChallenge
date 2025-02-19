
// 1394. Find Lucky Integer in an Array
// Solved
// Easy
// Topics
// Companies
// Hint
// Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.

// Return the largest lucky integer in the array. If there is no lucky integer return -1.

 

// Example 1:

// Input: arr = [2,2,3,4]
// Output: 2
// Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
// Example 2:


import java.util.*;
class Solution {
    public int findLucky(int[] arr) {
        int ans = -1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (var entry : map.entrySet()) {
            var key = entry.getKey(); 
            var value = entry.getValue(); 

            if(key == value){
                ans = Math.max(ans,key);
            }
        }
        return ans;
    }
}