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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head, fast=head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;
        ListNode a = null, b = mid, c = mid.next;
        while(b!=null){
            b.next = a;
            a = b;
            b = c;
            if(c!=null){
                c = c.next;
            }
        }
        boolean x=false;
        while(a!=null){
            if(head.val!=a.val){
                 return false;
            }
            head = head.next;
            a = a.next;
        }
        return true;
        
           
    }
}