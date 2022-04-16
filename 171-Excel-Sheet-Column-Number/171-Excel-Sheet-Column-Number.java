class Solution {
    public int titleToNumber(String columnTitle) {
        int place = 0;
        for(char c : columnTitle.toCharArray()){
            place = place * 26 + (int) c - (int) 'A' + 1;
        }
        return place;
    }
}
