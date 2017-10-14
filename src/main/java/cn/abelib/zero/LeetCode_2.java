package cn.abelib.zero;

/**
 * Created by abel-huang on 2016/7/26.
 * Is similar with Leetcode 237, but I do not know why I must delete this
 * ----//listNode.next = l1 == null ? l2 : l1; in this question rather than
 * 237?
 */
public class LeetCode_2 {
    public static void main(String args[]){
        int nums[]={1,2,3,4,5,6,7,8,9,10,10};
        //System.out.print(removeDuplicates(nums));
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        ListNode head;//��ʼ�����
        int temp=0;
        head=new ListNode((l1.val+l2.val)%10);
        temp=(l1.val+l2.val)/10;
        l1=l1.next;
        l2=l2.next;
        ListNode listNode=head;
        while(l1!=null||l2!=null){
           if(l1!=null&&l2!=null){
               listNode.next=new ListNode((l1.val+l2.val+temp)%10);
               temp=(l1.val+l2.val+temp)/10;
               l1=l1.next;
               l2=l2.next;
           }
           else if(l1!=null&&l2==null){
               listNode.next=new ListNode((l1.val+temp)%10);
               temp=(l1.val+temp)/10;
               l1=l1.next;
           }
           else if(l2!=null&&l1==null){
               listNode.next=new ListNode((l2.val+temp)%10);
               temp=(l2.val+temp)/10;
               l2=l2.next;
           }
            listNode=listNode.next;
        }
        if(temp!=0){
            ListNode nextNode = new ListNode(temp);
            listNode.next = nextNode;
        }
        //listNode.next = l1 == null ? l2 : l1;
        return head;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
