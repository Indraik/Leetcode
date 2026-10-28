/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        ListNode a = null, b = head, c = head.next;

        while(b != null){
            b.next = a;
            a = b;
            b = c;
            if(c != null){
                c = c.next;
            }
        }
        return a;
    }
}