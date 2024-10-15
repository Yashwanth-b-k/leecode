class Solution {
    public ListNode partition(ListNode head, int x) {
        // Two dummy nodes for partitioned lists
        ListNode lessHead = new ListNode(0);  // Dummy head for nodes < x
        ListNode greaterHead = new ListNode(0);  // Dummy head for nodes >= x
        
        // Two pointers to build the new lists
        ListNode less = lessHead;
        ListNode greater = greaterHead;

        // Traverse the list
        while (head != null) {
            if (head.val < x) {
                // Add the node to the 'less' list
                less.next = head;
                less = less.next;
            } else {
                // Add the node to the 'greater' list
                greater.next = head;
                greater = greater.next;
            }
            head = head.next;  // Move to the next node
        }

        // Link the end of the 'greater' list to null
        greater.next = null;

        // Connect the 'less' list to the 'greater' list
        less.next = greaterHead.next;

        // Return the head of the 'less' list, skipping the dummy node
        return lessHead.next;
    }
}
