class Solution {
    public String addBinary(String a, String b) {
        int x=a.length()-1;
        int y=b.length()-1; 
        String s = new String("");
        int carry=0;
        while(x >= 0 || y >= 0)        
        {
          
        int sum=carry; 
            if(x>=0)
            {
                sum=sum+a.charAt(x)-'0';
            }
            if(y>=0)
            {
                sum=sum+b.charAt(y)-'0';
            }
            s=s+sum%2;
            carry=sum/2;
            
            
            x--;
            y--;
            
        }
        if(carry!=0)
        {
           s=s+carry; 
        }
    
        char c;
        String sr = new String ("");
        for (int i=0; i<s.length(); i++)
        {
        c= s.charAt(i);
        sr= c+sr;
        }
      
        return sr;
    }
}
    
