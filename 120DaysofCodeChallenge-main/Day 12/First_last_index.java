// 34. Find First and Last Position of Element in Sorted Array
// Solved
// Medium
// Topics
// Companies
// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Example 2:

// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]




class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s=0;
        int e = nums.length-1;
        int arr[] = new int[2];
        arr[0]=first(nums,target);
        arr[1]= last(nums,target);

        return arr;
    }
    public int first(int []nums,int tar){
        int s=0;
        int e=nums.length-1;
        int f=-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            
            if(nums[mid]<tar){
                s=mid+1;
            }
            else if(nums[mid]>tar){
                e=mid-1;
            }
            else{
                f=mid;
                e=mid-1;
            }
        }
        return f;
    }
    public int last(int []nums,int tar){
        int s=0;
        int e=nums.length-1;
        int l=-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            
            if(nums[mid]<tar){
                s=mid+1;
            }
            else if(nums[mid]>tar){
                e=mid-1;
            }
            else{
                l=mid;
                s=mid+1;
            }
        }
        return l;
    }
}