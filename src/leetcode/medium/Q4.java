package leetcode.medium;

public class Q4 {
	
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int n1=nums1.length;
		int n2=nums2.length;
		int length=n1+n2;		
		if((length&0x1)==1){
			return (double)findKth(nums1,n1,0,nums2,n2,0,length/2+1);
		}
		else{
			return (double)(findKth(nums1,n1,0,nums2,n2,0,length/2)+findKth(nums1,n1,0,nums2,n2,0,length/2+1))/2;
		}
	}
	public double findKth(int[] nums1,int n1,int start1,int[] nums2,int n2,int start2,int k){
		if(n1-start1>n2-start2){
			return findKth(nums2,n2,start2,nums1,n1,start1,k);
		}
		if(n1-start1==0)
			return nums2[start2+k-1];
		if(k==1)
			return Math.min(nums1[start1],nums2[start2]);
		int kk=Math.min(k/2,n1-start1);
		if(nums1[start1+kk-1]<nums2[start2+k-kk-1]){
			return findKth(nums1,n1,start1+kk,nums2,n2,start2,k-kk);
		}
		else{
			return findKth(nums1,n1,start1,nums2,n2,start2+kk,k-kk);
		}
	}
}
