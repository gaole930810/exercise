package leetcode.medium;

public class Q495 {
	public static int findPoisonedDuration(int[] timeSeries, int duration) {
    
		int res=0;
		int end=0;
		
		for(int at:timeSeries){
			int newstart=at;
			int newend=at+duration;
			if(newstart>end){
				res+=newend-newstart;
				end=newend;
			}
			else if(newend>end){
				res+=newend-end;
				end=newend;
			}
		}
		return res;
    }
}
