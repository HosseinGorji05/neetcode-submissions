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
    public boolean hasCycle(ListNode head) {
        Map<Integer , ListNode> nodes = new HashMap<>();
        int index = 0;
        while(head != null){
            if(nodes.containsValue(head.next)){
                return true;
            } else {
               nodes.put(index , head);
               index++;
               head = head.next;
            }
        }

        return false;
    }
}
