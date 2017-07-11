package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class Q565 {
	public static int arrayNesting(int[] nums) {
/*		int max=0;
//		Map<String,Integer> record=new HashMap<String,Integer>();
		
		int[][] record=new int[20000][20000];
		for(int i=0;i<nums.length;i++){
			int nest=nums[i];
			int count=1;
			while(i!=nest){
				if(nest<i){
					int temp=record[nest][i];
					if(temp!=0){
						count+=temp;
						break;
					}
				}
					
				if(i<nest)
					record[i][nest]= count;				
				count++;
				nest=nums[nest];
			}
			max=max>=count?max:count;
		}
		return max;*/
		int max=0;
		Map<String,Integer> record=new HashMap<String,Integer>();
		for(int i=0;i<nums.length;i++){
			int nest=nums[i];
			int count=1;
			while(i!=nest){
				if(nest<i){
					Integer temp=record.get(String.valueOf(nest)+"_"+String.valueOf(i));
					if(temp!=null){
						count+=temp;
						break;
					}
				}
					
				if(i<nest)
					record.put(String.valueOf(i)+"_"+String.valueOf(nest), count);				
				count++;
				nest=nums[nest];
			}
			max=max>=count?max:count;
		}
		return max;
/*		int max=0;
		Map<Integer,Integer> record=new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
			int nest=nums[i];
			int count=1;
			while(i!=nest){
				if(nest<i){
					Integer temp=record.get(nest*100000+i);
					if(temp!=null){
						count+=temp;
						break;
					}
				}
					
				if(i<nest)
					record.put(i*100000+nest, count);				
				count++;
				nest=nums[nest];
			}
			max=max>=count?max:count;
		}
		return max;*/
    }
}
