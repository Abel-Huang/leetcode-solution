package cn.abelib.zero;


/**
 * Created by abel-huang on 2016/7/26.
 * ���ҵ���Ҫɾ����λ�ã�����ý�������һ���ڵ���ֱ�ӵ���null��
 * ���������������ڵ����һ���ڵ㸲�ǡ�
 * a?b:c----->if(a)
 *              return b;
 *           else
 *              return c;
 */
public class LeetCode_19 {
    public static void main(String args[]){
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        head=removeNthFromEnd(head,1);
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
            return head;
        else{
            ListNode temp=head;
            int length=0;
            int index=0;
           while (temp!=null){
               length++;
               temp=temp.next;
           }
            ListNode temp2=head;
            if(length==n)
                return head.next;
            while(index<length-n-1){
                temp2=temp2.next;
                index++;
            }
            if(n==1){
                temp2.next=null;
            }else {
                temp2.next=temp2.next.next;
            }
            return head;
        }
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
