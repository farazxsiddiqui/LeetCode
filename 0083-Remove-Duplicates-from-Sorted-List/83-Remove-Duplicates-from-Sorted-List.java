class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
        {
            return null;
        }
        ListNode temp = head;
        ListNode temp2 = head.next;
        while(temp2 != null)
        {
            if(temp.val == temp2.val)
            {
                temp.next = temp2.next;
                temp2 = temp2.next;   
            }
            else
            {
                temp = temp.next;
                temp2 = temp2.next;    
            }
                     
        }
        return head; 
    }
}
