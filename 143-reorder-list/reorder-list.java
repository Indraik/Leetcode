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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if(head == null || head.next == null){
            return;
        }
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        ListNode pre = null, nxt = slow.next;
        while(mid != null){
            ListNode temp = mid.next;
            mid.next = pre;
            pre = mid;
            mid = temp;
            
        }
        
        ListNode first = head, sec = pre;
        while(sec != null){
            ListNode t1 = first.next;
            ListNode t2 = sec.next;
            first.next = sec;
            sec.next = t1;
            first = t1;
            sec = t2;
        }
    }
}