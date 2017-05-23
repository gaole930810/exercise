package leetcode.medium;

public class Q3 {
	public int lengthOfLongestSubstring(String s) {
		int maxL=0;
//		String maxSubStr="";
		char [] charArray=s.toCharArray();
		
		for(int start=0;start<charArray.length&&charArray.length-start>maxL;start++){
			int locat=start;
			String subStr="";
			for(;locat<charArray.length;locat++){
				String c=String.valueOf(charArray[locat]);
				if(subStr.contains(c)){
					start+=subStr.indexOf(c);
					break;
				}					
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
