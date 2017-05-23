package leetcode.medium;

public class Q3 {
	public int lengthOfLongestSubstring(String s) {
		int maxL=0;
//		String maxSubStr="";
		char [] charArray=s.toCharArray();
		
		for(int start=0;start<charArray.length&&charArray.length-start>maxL;start++){
			int locat=start;
			String subStr="";
			for(String c=String.valueOf(charArray[locat]);locat<charArray.length;locat++){
				if(subStr.contains(c))
					break;
				subStr+=c;
			}
			if(subStr.length()>maxL){
				maxL=subStr.length();
//				maxSubStr=subStr;
			}
			
		}		
		return maxL;
	}

}
