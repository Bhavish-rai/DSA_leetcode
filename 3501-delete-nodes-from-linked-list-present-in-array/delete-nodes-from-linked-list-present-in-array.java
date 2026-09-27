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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> s=new HashSet<>();
        for(int i : nums)
        {
            if(s.contains(i))
            {
                continue;
            }
            else
            {
                s.add(i);
            }
        }
        
        while(s.contains(head.val))
        {
            head=head.next;
        }
        ListNode b=head;
       
        while(b.next!=null)
        {
            if(s.contains(b.next.val))
            {
                b.next=b.next.next;
                
            }
            else{
                b=b.next;
            }
        }
        return head;
    }
}