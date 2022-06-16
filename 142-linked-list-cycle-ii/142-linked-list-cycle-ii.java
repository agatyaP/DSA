/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
     public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // calculate the length
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        int length =0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = lengthCycle(slow);
                break;
            }
        }
//         while(fast!=null && fast.next!=null){
//             fast=fast.next.next;
//             slow=slow.next;
//             if(fast==slow){
//                 ListNode temp=slow;
                
//                 do{
//                     temp = temp.next;
//                     length++;
//                 }while(temp!=slow);
                
//             }
            
//     }
        if (length==0){
                    return null;
                }
                ListNode f = head;
        ListNode s = head;
                //we have l, move s by l times
                while (length > 0){
                    s=s.next;
                    length --;
                }
                //now move both by k times and theyll meet
                while(f!=s){
                    f=f.next;
                    s=s.next;
                }
                return s;
}
}