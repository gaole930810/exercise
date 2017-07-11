package leetcode.easy;

public class Q581 {
	public static int findUnsortedSubarray(int[] nums) {
		if(nums.length==0)
			return 0;
        int res=0;
        int l=0;
        int r=nums.length-1;
        int end=0;
        for(int i=l;i<nums.length-1;i++){        	
        	for(int j=i+1;j<nums.length;j++){
        		if(nums[i]>nums[j]){
        			l=i;
        			end=1;
            		break;
        		}       			
        	}
        	if(end==1)
        		break;
        	if(i==nums.length-2)
        		return 0;
        		
        }
        end=0;
        for(int i=r;i>0;i--){       	
        	for(int j=i-1;j>=0;j--){
        		if(nums[i]<nums[j]){
        			r=i;
        			end=1;
            		break;
        		}       			
        	}
        	if(end==1)
        		break;
        	if(i==1)
        		return 0;
        }
        System.out.println(l);
        System.out.println(r);
        res=r-l+1;
		return res;
    }

}
