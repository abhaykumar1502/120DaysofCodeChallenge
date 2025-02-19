
// 229. Majority Element II
// Solved
// Medium
// Topics
// Companies
// Hint
// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

 

// Example 1:

// Input: nums = [3,2,3]
// Output: [3]
// Example 2:

// Input: nums = [1]
// Output: [1]
// Example 3:

// Input: nums = [1,2]
// Output: [1,2]
 



class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> li = new ArrayList<>();
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(var ele: nums){
            map.put(ele , map.getOrDefault(ele,0) + 1);
        }

        for(var ele: map.entrySet()){
            if(ele.getValue()>n/3){
                li.add(ele.getKey());
            }
        }
         return li;
    }
   
}