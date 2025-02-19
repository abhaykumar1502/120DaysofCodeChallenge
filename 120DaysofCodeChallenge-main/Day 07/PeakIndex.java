// 852. Peak Index in a Mountain Array
// Solved
// Medium
// Topics
// Companies
// You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.

// Return the index of the peak element.

// Your task is to solve it in O(log(n)) time complexity.

 

// Example 1:

// Input: arr = [0,1,0]

// Output: 1


class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s = 0, e = arr.length - 1;
        
        while (s < e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] < arr[mid + 1]) {
                s = mid + 1;
            } else {
                e = mid; 
            }
        }
        return s;
    }
}
