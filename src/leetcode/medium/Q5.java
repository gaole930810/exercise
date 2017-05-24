package leetcode.medium;


public class Q5 {
	public String longestPalindrome(String s) {
		if(s.length()==1||s.length()==0)
			return s;
		else{
			if(s.charAt(0)==s.charAt(s.length()-1)&&longestPalindrome(s.substring(1,s.length()-1)).length()==s.length()-2){
				return s;
			}
			else{
				String subL=longestPalindrome(s.substring(0,s.length()-1));
				String subR=longestPalindrome(s.substring(1,s.length()));
				return subL.length()>=subR.length()?subL:subR;
			}
		}
    }
	/**
	 * 
	 */

}
