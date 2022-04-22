class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String ns = new String("");
        //Converting s into a character array
        //Typecasting elements into integer using typecasting, now the integer variable             //holds the ascii value of each element in the array.
        //If the ascii value of that element falls between ascii values of number or 
        //lowercase alphabets, append them into an empty string.
        StringBuilder sn1 = new StringBuilder();
        for(int c : s.toCharArray())
        {

            if(c>=48 && c<=57 || c>=97 && c<=122)
            {
                sn1.append(c);
                char ch;
                ch = (char) c;
                ns = ns+ch;
                
            }
        }
        //Storing s in a StringBuilder, then reversing it and then creating a new string
        //and storing the StringBuilder in it as a string.
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        String sn2 = sb.toString();
        
        StringBuilder sn2r = new StringBuilder();
        String nsr = new String("");
        for(int d : sn2.toCharArray())
        {
            if(d>=48 && d<=57 || d>=97 && d<=122)
            {
                sn2r.append(d);
                char ch2;
                ch2 = (char) d;
                nsr = nsr+ch2;
            }
        }
        boolean eq = ns.equals(nsr);
        return eq;
    }
}
