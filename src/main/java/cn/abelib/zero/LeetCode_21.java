package cn.abelib.zero;

/**
 * Created by abel-huang on 2016/7/25.
 * This is the simplest questions about link list, I AC follow other's code,
 * but I can get many ideas about how to use link list in Java.
 */
public class LeetCode_21 {
    public static void main(String args[]){
        int nums[][]={{1,2,0,4},{5,6,7,8},{9,10,11,12},{13,0,15,16}};
        //System.out.print(searchMatrix(nums,6));
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        ListNode head;//��ʼ�����
        if(l1.val>=l2.val){
            head=l2;
            l2=l2.next;
        }
        else{
            head=l1;
            l1=l1.next;
        }
        ListNode listNode=head;
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
               listNode.next=l1;
                l1=l1.next;
            }
            else{
                listNode.next=l2;
                l2=l2.next;
            }
            listNode=listNode.next;
        }
        listNode.next = l1 == null ? l2 : l1;
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
