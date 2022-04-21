class Solution {
    public int lengthOfLastWord(String s) {
        String[] news = s.split(" ");
        return news[news.length-1].length();  
    }
   
}
