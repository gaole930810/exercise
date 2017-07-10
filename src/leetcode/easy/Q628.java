package leetcode.easy;

import java.util.Arrays;

public class Q628 {
	public static int MaximumProductofThreeNumbers(int[] x){
		
		Arrays.sort(x);
		int l=x.length;
		int res1=x[l-1]*x[l-2]*x[l-3];
		int res2=x[0]*x[1]*x[l-1];
		return res1>res2?res1:res2;
	}

}
