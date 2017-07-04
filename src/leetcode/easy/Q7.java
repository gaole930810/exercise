package leetcode.easy;

public class Q7 {
	public static int reverse(int x){
		int res=0;
		final int max=0x7fffffff;  //int×î´óÖµ  
        final int min=0x80000000;
        int y=x;
		while(x!=0){
			int temp=x%10;
			if(res*10+temp>max||res*10+temp<min||(res*10+temp)*y<0){
				System.out.println("overflow!");
				return y>0? max:min;
			}
			res=res*10+temp;
			x=x/10;
		}
		return res;
	}

}
