class Solution {
    public boolean judgeCircle(String moves) {
        int countl=0,countr=0,countu=0,countd=0;
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='L')
            {
                countl++;
            }
            else if(moves.charAt(i)=='R')
            {
                countr++;
            }
            else if(moves.charAt(i)=='U')
            {
                countu++;
            }
            else if(moves.charAt(i)=='D')
            {
                countd++;
            }
        }
        if(countl==countr && countu==countd)
        {
            return true;
        }
        return false;
        
    }
}
