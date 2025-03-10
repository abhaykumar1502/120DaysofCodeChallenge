// 3174. Clear Digits
// Solved
// Easy
// Topics
// Companies
// Hint
// You are given a string s.

// Your task is to remove all digits by doing this operation repeatedly:

// Delete the first digit and the closest non-digit character to its left.
// Return the resulting string after removing all digits.

// Note that the operation cannot be performed on a digit that does not have any non-digit character to its left.

 

// Example 1:

// Input: s = "abc"

// Output: "abc"

// Explanation:

// There is no digit in the string.

// Example 2:

// Input: s = "cb34"

// Output: ""

// Explanation:

// First, we apply the operation on s[2], and s becomes "c4".

// Then we apply the operation on s[1], and s becomes "".

class Solution {
    public String clearDigits(String s) {
        Stack <Character> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(c);
            }
        }
        StringBuilder str = new StringBuilder();
        for(char c:st){
            str.append(c);
        }
        return str.toString();
    }
}