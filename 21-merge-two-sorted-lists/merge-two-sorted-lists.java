class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Dummy node to build the new list
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // While both lists have nodes
        while (list1 != null && list2 != null) {

            // Pick the smaller value
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        // If any list still has nodes, attach it
        if (list1 != null) {
            current.next = list1;
        }
        if (list2 != null) {
            current.next = list2;
        }

        return dummy.next; // head of merged list
    }
}
