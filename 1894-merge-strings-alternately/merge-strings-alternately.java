class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i1 = 0;
        int i2 = 0;
        StringBuilder res = new StringBuilder();
        int l1 = word1.length();
        int l2 = word2.length();
        while (i1 < l1 || i2 < l2) {
            if(i1 < l1) {
                res.append(word1.charAt(i1++));
            }
            if(i2 < l2) {
                res.append(word2.charAt(i2++));
            }
        }
        return res.toString();
    }
}