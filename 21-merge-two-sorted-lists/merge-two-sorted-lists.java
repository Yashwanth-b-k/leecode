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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode op = new ListNode(0);
        ListNode temp = op;
        ArrayList<Integer> res = new ArrayList();
        while(list1 != null){
            res.add(list1.val);
            list1 = list1.next;
        }
        while(list2 != null){
            res.add(list2.val);
            list2 = list2.next;
        }

        Collections.sort(res);

        for(int j: res){
            temp.next = new ListNode(j);
            temp = temp.next;
        }

        return op.next;
    }
}