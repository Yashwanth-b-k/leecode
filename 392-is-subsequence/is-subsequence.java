class Solution {
    public boolean isSubsequence(String s, String t) {

        // if(s.length() == 0) return true;
        // if(t.length() == 0) return false;
        // char[] s_char = s.toCharArray();
        // char[] t_char = t.toCharArray();

        // s = new String(s_char);
        // t = new String(t_char);
        int i = 0;
        int j = 0;
        while(j < t.length() && i<s.length()){
            if(s.charAt(i) == t.charAt(j) ){
                i++;
            }
                j++;
            
        }
        return i == s.length();
    }
}