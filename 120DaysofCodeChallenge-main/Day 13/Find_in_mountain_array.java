// 1095. Find in Mountain Array
// Solved
// Hard
// Topics
// Companies
// Hint
// (This problem is an interactive problem.)

// You may recall that an array arr is a mountain array if and only if:

// arr.length >= 3
// There exists some i with 0 < i < arr.length - 1 such that:
// arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
// arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
// Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.

// You cannot access the mountain array directly. You may only access the array using a MountainArray interface:

// MountainArray.get(k) returns the element of the array at index k (0-indexed).
// MountainArray.length() returns the length of the array.
// Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions that attempt to circumvent the judge will result in disqualification.

 

// Example 1:

// Input: mountainArr = [1,2,3,4,5,3,1], target = 3
// Output: 2
// Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
// Example 2

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index);
 *     public int length();
 * }
 */

 class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        return first(mountainArr, target);
    }

    public int first(MountainArray mountainArr, int tar) {
        int peak = peakIndex(mountainArr);

        int s = 0, e = peak;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int midVal = mountainArr.get(mid);

            if (midVal < tar) {
                s = mid + 1;
            } else if (midVal > tar) {
                e = mid - 1;
            } else {
                return mid;
            }
        }

        return last(mountainArr, tar, peak + 1, mountainArr.length() - 1);
    }

    public int last(MountainArray mountainArr, int tar, int s, int e) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int midVal = mountainArr.get(mid);

            if (midVal > tar) {
                s = mid + 1;
            } else if (midVal < tar) {
                e = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private int peakIndex(MountainArray mountainArr) {
        int s = 0, e = mountainArr.length() - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }
}
