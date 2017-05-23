package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Q5 {
	public String longestPalindrome(String s) {
		int maxL=0;
		List<Character> l=new ArrayList<Character>();
		String maxSubStr="";
		char [] charArray=s.toCharArray();
		for(int start=0;start<charArray.length&&charArray.length-start>maxL;start++){
			if(!l.contains(s.charAt(start))){
				l.add(s.charAt(start));
				int subStrL=s.lastIndexOf(s.charAt(start))-start+1;
				if(subStrL>maxL){
					maxL=subStrL;
					maxSubStr=s.substring(start,start+subStrL);
				}
			}
		}
		
		for(int start=0;start<charArray.length&&charArray.length-start>maxL;start++){
			int locat=start;
			String subStr="";
			for(;locat<charArray.length;locat++){
				String c=String.valueOf(charArray[locat]);
				if(subStr.contains(c)){
					start+=subStr.indexOf(c);
					subStr=s.substring(start, locat+1);
					break;
				}					
				subStr+=c;
			}
			if(subStr.length()>maxL){
				maxL=subStr.length();
				maxSubStr=subStr;
			}
			
		}		
		return maxSubStr;
    }
	

}
