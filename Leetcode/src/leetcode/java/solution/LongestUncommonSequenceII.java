package leetcode.java.solution;


/****************************************************************** 
Given a list of strings, you need to find the longest uncommon 
subsequence among them. The longest uncommon subsequence is defined 
as the longest subsequence of one of these strings and this subsequence 
should not be any subsequence of the other strings.

A subsequence is a sequence that can be derived from one sequence 
by deleting some characters without changing the order of the remaining
elements. Trivially, any string is a subsequence of itself and an 
empty string is a subsequence of any string.

The input will be a list of strings, and the output needs to be the 
length of the longest uncommon subsequence. If the longest uncommon 
subsequence doesn't exist, return -1.

Example 1:
Input: "aba", "cdc", "eae"
Output: 3
********************************************************************/

public class LongestUncommonSequenceII {
	public int findLUSlength(String[] strs) {
		boolean f = true;
		String str = strs[0];
		int max = 0;
		for(String s : strs) {
			if(!s.equals(str)) f = false;
			str = s;
			max = Math.max(max, s.length());
		}
		return f? -1:max;
	}
}
