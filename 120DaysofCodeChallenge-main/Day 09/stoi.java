// 8. String to Integer (atoi)
// Solved
// Medium
// Topics
// Companies
// Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.

// The algorithm for myAtoi(string s) is as follows:

// Whitespace: Ignore any leading whitespace (" ").
// Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
// Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
// Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.
// Return the integer as the final result.

 

// Example 1:

// Input: s = "42"

// Output: 42

// Explanation:

// The underlined characters are what is read in and the caret is the current reader position.
// Step 1: "42" (no characters read because there is no leading whitespace)
         



class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) return 0;

        int ans = 0;
        boolean flag = false;
        int i = 0;

        if (s.charAt(i) == '-') {
            flag = true;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';

            if (ans > (Integer.MAX_VALUE - digit) / 10) {
                return flag ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            ans = ans * 10 + digit;
            i++;
        }

        if (flag) {
            ans = -ans;
        }

        return ans;
    }
}
