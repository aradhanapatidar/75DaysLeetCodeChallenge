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
    public ListNode reverseList(ListNode head) {
       if(head==null)  return head;
        int count=0;
        ListNode temp=head;
        while(temp.next!=null){
        temp=temp.next;
        count++;
        }
        temp=head;
int []arr=new int[count+1];
for(int i=0; i<arr.length; i++){
    arr[i]=temp.val;
    temp=temp.next;
}
  ListNode dummy=new ListNode(-1);
  ListNode ans=dummy;
    for(int i=arr.length-1; i>=0; i--){
     ans.next=new ListNode(arr[i]);
     ans=ans.next;
    }
        return dummy.next; 
    }
}