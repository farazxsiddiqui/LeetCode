class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i=0;i<word1.length;i++)
        {
            sb1.append(word1[i]);
        }
        for(int i=0;i<word2.length;i++)
        {
            sb2.append(word2[i]);
        }
        return sb1.toString().equals(sb2.toString());
        /*
        if(sb1.length()!=sb2.length())
        {
            return false;
        }
        sb1.toString();
        sb2.toString();
        Boolean eq = true;
        for(int i=0;i<sb1.length();i++)
        {
            if(sb1.charAt(i)!=sb2.charAt(i))
            {
                eq = false;
            }
        }
        return eq;
        */
        
    }
}
