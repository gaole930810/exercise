package leetcode.easy;

import java.util.HashMap;

public class Q167 {
	 public int[] twoSum(int[] numbers, int target) {
	        int[] res=new int[2];
	        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	        for(int i=0;i<numbers.length;i++){
	        	map.put(numbers[i], i);
	        }
	        for(int i=0;i<numbers.length;i++){
	        	if(map.containsKey(target-numbers[i])&&(res[1]=map.get(target-numbers[i]))!=i){
	        		res[0]=i+1;
	        		res[1]++;
	        		break;
	        	}
	        }
	        return res;
	    }

}
