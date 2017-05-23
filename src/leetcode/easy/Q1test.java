package leetcode.easy;
import leetcode.basicDatastructure.*;
import leetcode.easy.*;
import leetcode.hard.*;
import leetcode.medium.*;
public class Q1test {
	
	public static void main(String[] argc){
		ListNode l1=new ListNode(2);
		ListNode pre=l1;
		pre.next=new ListNode(4);
		pre=pre.next;
		pre.next=new ListNode(3);
			
		
		ListNode l2=new ListNode(5);
		pre=l2;
		pre.next=new ListNode(6);
		pre=pre.next;
		pre.next=new ListNode(4);
		
		Q2 solution = new Q2();
		ListNode res=solution.addTwoNumbers(l1,l2);
		ListNode temp=res;
		while(temp!=null){
			System.out.println(temp.val+" ");
			temp=temp.next;
		}
		
	}
}
