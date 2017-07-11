package leetcode.easy;

public class Q605 {
	public static  boolean canPlaceFlowers(int[] flowerbed, int n) {
		boolean res=false;
		int count=0;
		int space=0;
		int case1=1;
		int case2=0;
		for(int i=0;i<flowerbed.length;i++){
			if(flowerbed[i]==0){
				space++;
			}
			else{
				if(case1==1){
					count+=space/2;
					if(count>=n)
						return true;
					space=0;
					case1=0;
					case2=1;
				}
				else if(case2==1){
					count+=(space-1)/2;
					if(count>=n)
						return true;
					space=0;
				}
			}
			
		}
		if(case1==1){
//			count-=space/2;
			count+=(space+1)/2;
		}
		if(case2==1){
//			count-=(space-1)/2;
			count+=space/2;
		}
		if(count>=n)
			return true;
        return res;
    }

}
