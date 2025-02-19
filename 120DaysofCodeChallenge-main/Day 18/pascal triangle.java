// 118. Pascal's Triangle
// Solved
// Easy
// Topics
// Companies
// Given an integer numRows, return the first numRows of Pascal's triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

// Example 1:

// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// Example 2:

// Input: numRows = 1
// Output: [[1]]
 



class Solution {
    public:
        vector<vector<int>> generate(int numRows) {
            vector<vector<int>> triangle;
            for (int i = 0; i < numRows; i++) {
                vector<int> row;
                for (int j = 0; j <= i; j++) {
                    int value;
                    if (j == 0 || j == i) {
                       row.push_back(1);
                    } else
                    if(i>0){
                 value = triangle[i - 1][j - 1] + triangle[i - 1][j];
                    row.push_back(value);
                    }
                }
                triangle.push_back(row);
            }
            return triangle;
        }
    };