/* Problem Statement:
Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.
An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:
Input: strs = ["act","pots","tops","cat","stop","hat"]
Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]

Example 2:
Input: strs = ["x"]
Output: [["x"]]

Example 3:
Input: strs = [""]
utput: [[""]]

Constraints:
    1 <= strs.length <= 1000.
    0 <= strs[i].length <= 100
    strs[i] is made up of lowercase English letters.

*/
public class Group_anagramusingHashmap {
	public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        
        // HashMap to store sorted string as key and list of anagrams as value
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            // Convert the string to char array, sort it, and convert back to string
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = new String(charArray);
            
            // Add to the corresponding anagram group in HashMap
            map.putIfAbsent(sortedKey, new ArrayList<>());
            map.get(sortedKey).add(s);
        }
        
        return new ArrayList<>(map.values()); // Convert values of map to List of Lists
    }
}
