package leetcode.easy;

import java.util.Arrays;

public class Q561 {
	public static int arrayPairSum(int[] nums) {
        int res=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){
            res+=nums[i];
        }
        return res;
    }

}
