package leetcode.medium;

public class Q6 {
	public static String zigtagconvert(String text, int nRows){
		String res="";	
		for(int i=0;i<nRows;i++){
			int t=0;
			while(2*(nRows-1)*t+i<text.length()){
				res+=text.charAt(2*(nRows-1)*t+i);
				if(i!=0&&i!=nRows-1&&2*(nRows-1)*t+i+2*nRows-2*(i+1)<text.length()){
					res+=text.charAt(2*(nRows-1)*t+i+2*nRows-2*(i+1));
				}
				t++;
			}			
		}
		
		return res;
	}

}
