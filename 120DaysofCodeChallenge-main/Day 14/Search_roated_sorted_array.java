
// 33. Search in Rotated Sorted Array
// Solved
// Medium
// Topics
// Companies
// There is an integer array nums sorted in ascending order (with distinct values).

// Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

// Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [4,5,6,7,0,1,2], target = 0
// Output: 4






class Solution {
    public int search(int[] nums, int target) {
        int pi = pivot(nums);
        if (pi == -1) {
            return binarysearch(nums, target, 0, nums.length - 1);
        }
        if (nums[pi] == target) {
            return pi;
        }
        if (target >= nums[0]) {
            return binarysearch(nums, target, 0, pi - 1);
        }
        return binarysearch(nums, target, pi + 1, nums.length - 1);
    }
    public int pivot(int arr[]){
        int s=0;
        int e = arr.length-1;
        while(s<e){
            int mid = s+(e-s)/2;
            if(mid<e && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>s && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[s]>=arr[mid]){
                e=mid-1;;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }
    public int binarysearch(int arr[],int tar,int s,int e){
        
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==tar){
                return mid;
            }
            else if(arr[mid]>tar){
                e=mid-1;;
            }
            else{
                s=mid+1;;
            }
        }
        return -1;
    }
}
