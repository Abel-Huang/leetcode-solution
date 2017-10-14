package cn.abelib.zero;

/**
 * Created by abel-huang on 2016/7/26.
 * I must consider about the tail of the link list and understand
 * the meaning of delete a node is just point the pre_node's next node to
 * the next_node of this node.
 */
public class LeetCode_83 {
    public static void main(String args[]){
        ListNode head=new ListNode(1);
        head.next=new ListNode(1);
        head.next.next=new ListNode(1);
        head.next.next.next=new ListNode(1);
        while(head!=null){
            System.out.println(deleteDuplicates(head).val);
            head=head.next;
        }
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode listNode=head;
        while(listNode!=null&&listNode.next!=null){
            if(listNode.val==listNode.next.val){
                listNode.next=listNode.next.next;
            }
            else
                listNode=listNode.next;
        }
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
