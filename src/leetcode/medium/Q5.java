package leetcode.medium;

import java.util.ArrayList;

public class Q5 {
	/**
	 * o(n)
	 * 
	 * @param s
	 * @return
	 */
	public String longestPalindrome(String s) {
		int l = s.length();
		if (l <= 1)
			return s;
		// 预处理
		String SF = "$#";
		for (int i = 0; i < s.length(); i++) {
			SF += s.charAt(i) + "#";
		}
		SF += "^";
		// 求p[]
		int L = SF.length();
		int[] p = new int[L];
		int mx = 0;
		int di = 0;
		for (int i = 1; i < L - 1; i++) {
			p[i] = mx > i ? Math.min(p[2 * di - i], mx - i) : 1;
			while (SF.charAt(i + p[i]) == SF.charAt(i - p[i]))
				p[i]++;
			if (i + p[i] > mx) {
				mx = i + p[i];
				di = i;
			}
		}
		//找最大子串
		int maxP = 0, index = 0;
		for (int i = 1; i < L - 1; i++)
			if (p[i] > maxP) {
				maxP = p[i];
				index = i;
			}
		return s.substring((index-maxP)/2, (index+maxP)/2-1);
	}
	/**
	 * o(n^2)
	 */
	/*
	 * public String longestPalindrome(String s) {
	 * if(s.length()==1||s.length()==0) return s; else{
	 * if(s.charAt(0)==s.charAt(s.length()-1)&&longestPalindrome(s.substring(1,s
	 * .length()-1)).length()==s.length()-2){ return s; } else{ String
	 * subL=longestPalindrome(s.substring(0,s.length()-1)); String
	 * subR=longestPalindrome(s.substring(1,s.length())); return
	 * subL.length()>=subR.length()?subL:subR; } } }
	 */

}
