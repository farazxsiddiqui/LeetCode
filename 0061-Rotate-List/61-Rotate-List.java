class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode temp = head;
        ListNode tail = head;
        int count = 0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        
        temp = head;
        if(k>count)
        {
            k=k%count;
        }
        for(int i=0; i<k; i++)
        {
            temp=tail;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            tail = temp.next;
            temp.next=null;
            tail.next=head;
            head = tail;
        }
        return head; 
    }
}
