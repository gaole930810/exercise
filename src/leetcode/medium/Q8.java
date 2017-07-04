package leetcode.medium;

public class Q8 {
	public static int String_to_Integer(String str){
		final int max=0x7fffffff;
		final int min=0x80000000;
		String str_trim=str.trim();
		int p=0;
		int sign=1;
		int res=0;
		
		while(str_trim.charAt(p)!='-'&&(str_trim.charAt(p)<'0'||str_trim.charAt(p)>'9'))p++;
		if(str_trim.charAt(p)=='-'){
			sign=-1;
			p++;
		}
		while(str_trim.charAt(p)>='0'&&str_trim.charAt(p)<='9'){
			int temp=(str_trim.charAt(p)-'0')*sign;
			if((res*10+temp)>max)return max;
			if((res*10+temp)<min)return min;
			res=res*10+temp;
			p++;
		}
		return res;
	} 

}
