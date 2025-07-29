class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i1 = 0;
        int i2 = 0;
        int length = word1.length() + word2.length();
        String res = "";
        int l1 = word1.length();
        int l2 = word2.length();
        int i = 0;
        while (i1 < l1 || i2 < l2) {
            if(i % 2 == 0 && i1 < l1) {
                res += word1.charAt(i1);
                i1++;
            } else if(i % 2 != 0 && i2 < l2) {
                res += word2.charAt(i2);
                i2++;
            }
            i++;
        }
        return res;
    }
}