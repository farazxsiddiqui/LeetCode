class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] sArray = new char[256];
        char[] tArray = new char[256];
        for(int i=0; i<s.length(); i++)
        {
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            if(sArray[sChar]==0 && tArray[tChar]==0)
            {
                sArray[sChar]=tChar;
                tArray[tChar]=sChar; 
            }
            if(sArray[sChar]!=tChar)
            {
                return false;
            }
        }
        return true;
    }
}
