class Solution {
    public String defangIPaddr(String address) {
    StringBuilder sb = new StringBuilder();
        //Check if character is != '.' and append it to StringBuilder, else append '[.]'.
       for(int i = 0; i<address.length();i++)
       {
           if(address.charAt(i)!='.')
           {
               sb.append(address.charAt(i));
           }
           
           else
           {
               sb.append("[.]");
           }
       } 
        return sb.toString();
    }
}
