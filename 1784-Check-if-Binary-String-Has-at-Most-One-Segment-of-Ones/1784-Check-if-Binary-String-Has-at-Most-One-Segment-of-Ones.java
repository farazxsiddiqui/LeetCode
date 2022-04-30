class Solution {
    public boolean checkOnesSegment(String s) {
        if(s.length()==1)
        {
            return true;
        }
        int count = 0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)!=s.charAt(i+1))
            {
                count++;
            }
        }
        if(count<2)
        {
            return true;
        }
        return false;
    }
}
