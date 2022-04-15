class Solution {
    public boolean isPalindrome(int x) {
        int p=x;
        int a=0;
        int f=0;
        
        while(p!=0)
        {
            a=p%10;
            f=a+f*10;
            p=p/10;
            
        }
        if(x<0||x%10==0&&x!=0)
        {
            return false;
        }
                         

        if(f==x)
        {
          
            return true;
        }
        else return false;
        
    }
}
