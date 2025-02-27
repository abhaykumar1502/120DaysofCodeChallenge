// 82. Remove Duplicates from Sorted List II
// Solved
// Medium
// Topics
// Companies
// Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.

 

// Example 1:


// Input: head = [1,2,3,3,4,4,5]
// Output: [1,2,5]
// Example 2:


// Input: head = [1,1,1,2,3]
// Output: [2,3]


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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next== null) return head;

        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode slow =temp;
        ListNode fast = head;

        while (fast != null) {
            if (fast.next != null && fast.val == fast.next.val) {
                while (fast.next != null && fast.val == fast.next.val) {
                    fast =fast.next;
                }
                slow.next =fast.next;
            } else {
                slow =slow.next;
            }
            
            fast = fast.next;
        }

        return temp.next;
    }
}
