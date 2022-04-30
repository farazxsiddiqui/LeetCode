class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp = node;
        while(temp.next!=null)
        {
            temp.val=temp.next.val;
            temp=temp.next;
        }
        ListNode temp2 = node;
        while(temp2.next.next!=null)
        {  
            temp2=temp2.next;
        }
        temp2.next=temp;
        temp2.next=null;
        
    }
}
