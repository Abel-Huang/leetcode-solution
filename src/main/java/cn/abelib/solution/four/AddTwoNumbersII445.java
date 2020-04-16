package cn.abelib.solution.four;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2020-04-14 21:34
 */
public class AddTwoNumbersII445 {
    public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        StringBuilder sum1 = new StringBuilder();
        while (l1 != null) {
            sum1.append(l1.val);
            l1 = l1.next;
        }
        StringBuilder sum2 = new StringBuilder();
        while (l2 != null) {
            sum2.append(l2.val);
            l2 = l2.next;
        }

        String sumStr = reverse(sum1.toString(), sum2.toString());
        ListNode head = new ListNode(0);
        ListNode node = head;
        for (char c : sumStr.toCharArray()) {
            node.next = new ListNode(c - '0');
            node = node.next;
        }
        return head.next;
    }

    private String reverse(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (len1 > len2) {
            for (int i = 0; i < len1 - len2; i ++) {
                sb2.append(0);
            }
        } else if (len1 < len2) {
            for (int i = 0; i < len2 - len1; i ++) {
                sb1.append(0);
            }
        }
        str1 = sb1.append(str1).toString();
        str2 = sb2.append(str2).toString();
        StringBuilder ans = new StringBuilder();
        int flag = 0;
        for (int i = str1.length() -1; i >= 0 ; i --) {
            int num = str1.charAt(i) + str2.charAt(i) - '0' - '0' + flag;
            ans.append(num % 10);
            flag = num / 10;
        }
        if (flag != 0) {
            ans.append(flag);
        }
        return reverse(ans.toString());
    }

    private String reverse(String str) {
        int len = str.length();
        if (len < 1) {
            return str;
        }
        return str.charAt(len - 1) + reverse(str.substring(0, len - 1));
    }

    @Test
    public void test1() {
//        ListNode l1 = new ListNode(7);
//        l1.next = new ListNode(2);
//        l1.next.next = new ListNode(4);
//        l1.next.next.next = new ListNode(3);
//        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);
//        System.err.println(addTwoNumbers(l1, l2));
        System.err.println(reverse("5", "5"));
    }
}
