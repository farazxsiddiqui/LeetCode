class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String str: words)
        {
            sb.append(new StringBuilder(str).reverse()+" ");
        }
        return sb.toString().trim();
    }
}
