/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        // 'prev' will hold the reference to the node we just reversed.
        // It starts at null because the new tail (original head) points to null.
        ListNode prev = null;
        
        // 'current' is the node we are currently processing.
        ListNode current = head;
        
        while (current != null) {
            // 1. Save the rest of the list.
            ListNode nextNode = current.next;
            
            // 2. Reverse the link: Make the current node point backward to 'prev'.
            current.next = prev;
            
            // 3. Move 'prev' forward: 'prev' now becomes the current node.
            prev = current;
            
            // 4. Move 'current' forward: 'current' becomes the saved next node.
            current = nextNode;
        }
        
        // After the loop, 'prev' is the new head of the reversed list.
        return prev;
    }
}