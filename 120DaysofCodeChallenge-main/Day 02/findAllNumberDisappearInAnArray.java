// 448. Find All Numbers Disappeared in an Array
// Solved
// Easy
// Topics
// Companies
// Hint
// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

// Example 1:

// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]
import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean find[] = new boolean[nums.length+1];

        for(int i : nums){
            find[i] = true;
        }
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=1;i<=nums.length;i++){
            if(!find[i]){
                ans.add(i);
            }
        }
        return ans;
    }
}