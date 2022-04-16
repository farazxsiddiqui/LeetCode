class Solution {
    public String convertToTitle(int columnNumber) {
     StringBuilder sb = new StringBuilder();
        while(columnNumber > 0) {
            int rem = columnNumber%26;
            columnNumber = columnNumber/26;
            if(rem == 0){
                rem = 26;
                columnNumber-=1;
            }
            sb.insert(0,(char)(rem+64));
        }
        
        return sb.toString();   
    }
}
