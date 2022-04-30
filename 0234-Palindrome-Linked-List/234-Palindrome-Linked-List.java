class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        StringBuilder sb = new StringBuilder();
        while(temp!=null)
        {
            sb.append(temp.val);
            temp=temp.next;
        }
        String s = sb.toString();
        String rs = sb.reverse().toString();
        if(s.equals(rs))
        {
            return true;
        }
        return false;
    }
}
