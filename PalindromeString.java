/* Problem Statement:
Given a string s, return true if it is a palindrome, otherwise return false.
A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.

Example 1:
Input: s = "Was it a car or a cat I saw?"
Output: true
Explanation: After considering only alphanumerical characters we have "wasitacaroracatisaw", which is a palindrome.

Example 2:
Input: s = "tab a cat"
Output: false*/

class Solution {
    public boolean isPalindrome(String s) {
        
        Boolean palindrome = false;
        //remove all spaces and special characters
        String compact = s.replaceAll("[^a-zA-Z0-9]+", "");
        StringBuffer sbf = new StringBuffer(compact);
          // Reverse String
        sbf.reverse();
        //compare if both the strings are same
        if(compact.equalsIgnoreCase(sbf.toString()))  {
            palindrome = true;
        }
        return palindrome;
    }
}
