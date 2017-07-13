package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class Q560 {
	public static int subarraySum(int[] nums, int k) {
		int res=0;
        Map<Integer,Integer> sumrecord=new HashMap<Integer,Integer>();
        int add=0;
        for(int i=0;i<nums.length;i++){
        	add+=nums[i];
        	if(add==k)
        		res++;
        	if(sumrecord.containsKey(add-k)){
    			res+=sumrecord.get(add-k);
    		}       	
        	if(!sumrecord.containsKey(add)){
        		sumrecord.put(add,1);
        	}
        	else{
        		sumrecord.replace(add, sumrecord.get(add)+1);
        	}
        }
        return res;
    }

}
