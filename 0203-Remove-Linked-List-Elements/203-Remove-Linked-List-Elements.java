class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        if(head==null)
        {
            return null;
        }
        while(temp.next!=null)
        {
            if(temp.next.val==val)
            {
                temp.next=temp.next.next;
            }
            else
            {
               temp=temp.next; 
            }  
        }
        if(head.val==val)
        {
            return head.next;
        }
        else
        {
            return head;
        }
        
    }
}
