class Solution {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while(temp!=null)
        {
            count++;
            temp = temp.next;
        }
        temp = head;
        for(int i=0; i<=count/2-1; i++)
        {
            temp=temp.next;
        }
        return temp;
    }
}
