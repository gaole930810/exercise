package leetcode.easy;

public class Q566 {
	public static int[][] matrixReshape(int[][] nums, int r, int c) {
		if(nums[0].length*nums.length!=r*c){
			show(nums);
			return nums;
		}
        int[][] reshape=new int[r][c];
        int nc=nums[0].length;
        for(int i=0;i<r;i++){
        	for(int j=0;j<c;j++){
        		reshape[i][j]=nums[(i*c+j)/nc][(i*c+j)%nc];
        	}
        }
        show(reshape);
        return reshape;
    }
	public static void show(int[][] nums){
		int c=nums[0].length;
		int r=nums.length;
		System.out.print("[");
		for(int i=0;i<r;i++){
			System.out.print("[");
			for(int j=0;j<c;j++){
				System.out.print(nums[i][j]);
				if(j!=c-1)System.out.print(",");
			}
			if(i==r-1)System.out.print("]");
		}
		System.out.println("]");
	}

}
