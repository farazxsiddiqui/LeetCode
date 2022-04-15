class Solution {
    public int romanToInt(String s) {
         int n = 0, ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
			switch (s.charAt(i)) {
                case 'I' : n = 1; break;
                case 'V' : n = 5; break;
                case 'X' : n = 10; break;
                case 'L' : n = 50; break;
                case 'C' : n = 100; break;
                case 'D' : n = 500; break;
                case 'M' : n = 1000; break;
            }
            if (n * 4 < ans) 
            {
                ans = ans - n;
            }
            else ans = ans + n;
        }
        return ans;
    }
}
