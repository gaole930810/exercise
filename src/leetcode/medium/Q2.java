package leetcode.medium;
import leetcode.basicDatastructure.*;
public class Q2 {
	public ListNode addTwoNumbers(ListNode l1,ListNode l2){
		ListNode res = new ListNode((l1.val+l2.val)%10);
		ListNode temp=res;
		ListNode a=l1.next;
		ListNode b=l2.next;
		int jin=(l1.val+l2.val)/10;
		while(a!=null||b!=null){
			if(a!=null&&b!=null){
				temp.next=new ListNode((a.val+b.val+jin)%10);				
				jin=(a.val+b.val+jin)/10;
				a=a.next;
				b=b.next;
				temp=temp.next;
			}
			if(a==null&&b!=null){
				temp.next=new ListNode((b.val+jin)%10);				
				jin=(b.val+jin)/10;
				b=b.next;
				temp=temp.next;
			}
			if(a!=null&&b==null){
				temp.next=new ListNode((a.val+jin)%10);				
				jin=(a.val+jin)/10;
				a=a.next;
				temp=temp.next;
			}
			
		}
		if(jin==1){
			temp.next=new ListNode(1);
		}
		
		return res;
	}

}
