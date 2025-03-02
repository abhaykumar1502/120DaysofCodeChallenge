// 2570. Merge Two 2D Arrays by Summing Values
// Solved
// Easy
// Topics
// Companies
// Hint
// You are given two 2D integer arrays nums1 and nums2.

// nums1[i] = [idi, vali] indicate that the number with the id idi has a value equal to vali.
// nums2[i] = [idi, vali] indicate that the number with the id idi has a value equal to vali.
// Each array contains unique ids and is sorted in ascending order by id.

// Merge the two arrays into one array that is sorted in ascending order by id, respecting the following conditions:

// Only ids that appear in at least one of the two arrays should be included in the resulting array.
// Each id should be included only once and its value should be the sum of the values of this id in the two arrays. If the id does not exist in one of the two arrays, then assume its value in that array to be 0.
// Return the resulting array. The returned array must be sorted in ascending order by id.

 

// Example 1:

// Input: nums1 = [[1,2],[2,3],[4,5]], nums2 = [[1,4],[3,2],[4,1]]
// Output: [[1,6],[2,3],[3,2],[4,6]]
// Explanation: The resulting array contains the following:
// - id = 1, the value of this id is 2 + 4 = 6.
// - id = 2, the value of this id is 3.
// - id = 3, the value of this id is 2.
// - id = 4, the value of this id is 5 + 1 = 6.
// Example 2:

// Input: nums1 = [[2,4],[3,6],[5,5]], nums2 = [[1,3],[4,3]]
// Output: [[1,3],[2,4],[3,6],[4,3],[5,5]]
// Explanation: There are no common ids, so we just include each id with its value in the resulting list





class Solution {
    public int[][] mergeArrays(int[][] n1, int[][] n2) {
        List<int[]> res = new ArrayList<>();
        int i = 0;
        int  j = 0;
        
        while (i < n1.length&& j < n2.length) {
            if (n1[i][0] == n2[j][0]) {
                res.add(new int[]{n1[i][0], n1[i][1] + n2[j][1]});
                i++;
                j++;
            } else if (n1[i][0] <n2[j][0]) {
                res.add(new int[]{n1[i][0], n1[i][1]});
                i++;
            } else {
                res.add(new int[]{n2[j][0],n2[j][1]});
                j++;
            }
        }
        
        while (i < n1.length) {
            res.add(new int[]{n1[i][0],n1[i][1]});
            i++;
        }
        
        while (j < n2.length) {
            res.add(new int[]{n2[j][0],n2[j][1]});
            j++;
        }
        
        return res.toArray(new int[res.size()][]);
    }
}
