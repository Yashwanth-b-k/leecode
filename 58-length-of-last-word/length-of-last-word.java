class Solution {
    public int lengthOfLastWord(String s) {
        String[] op= s.split("\\s+");
        String word = op[op.length - 1];
        return word.length();
    }
}