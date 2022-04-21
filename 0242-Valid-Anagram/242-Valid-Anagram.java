class Solution {
    public boolean isAnagram(String s, String t) {
        char [] as = new char[s.length()];
        char [] at = new char[t.length()];
        as = s.toCharArray();
        Arrays.sort(as);
        at = t.toCharArray();
        Arrays.sort(at);
        boolean eq = Arrays.equals(as,at);
        return eq;
    }
}
