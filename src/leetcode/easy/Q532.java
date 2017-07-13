package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Q532 {
	public static int findPairs(int[] nums, int k) {
        int count=0;
        Map<Integer,Integer> record=new HashMap<Integer,Integer>();
        if(k<0)
        	return 0;
        if(k==0){
        	for(int num:nums){
        		if((record.containsKey(num))&&record.get(num)==0){
        			count++;
        			record.replace(num, 1);
        		}        			
        		else if(!(record.containsKey(num)))
        			record.put(num, 0);
        	}
        	return count;
        }
        for(int num:nums){
    		if(!(record.containsKey(num)))
    			record.put(num, 0);
    	}
        for(int num:record.keySet()){
        	if(record.containsKey(num+k)){
        		count++;
        	}
        }
        return count;
    }

}
