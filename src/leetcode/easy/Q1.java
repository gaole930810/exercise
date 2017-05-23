package leetcode.easy;

import java.util.HashMap;

public class Q1 {
	public int[] twoSum(int[] nums, int target) {
		int[] res=new int[2];
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
        	map.put(nums[i], i);
        }
        for(int i=0;i<nums.length;i++){
        	if(map.containsKey(target-nums[i])&&(res[1]=map.get(target-nums[i]))!=i){
        		res[0]=i;
        		break;
        	}
        }
        return res;     
    }
	/**
	 * o(n^2)
	 */
/*	public int[] twoSum(int[] nums, int target) {
        int[] r=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    r[0]=i;
                    r[1]=j;
                    return r;
                }
            }
        }
        return null;        
    }*/
}
