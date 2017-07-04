package leetcode.easy;

public class Q9 {
	public static boolean checkPalindromeNumber(int x){
		if(x<0)return false;
		if(x==0)return true;
		int base=1;
		while(x/base>=10)base*=10;
		while(x!=0){
			int left=x/base;
			int right=x%10;
			if(left!=right)return false;
			x-=left*base;
			x/=10;
			base/=100;
		}		
		return true;
	}

}
