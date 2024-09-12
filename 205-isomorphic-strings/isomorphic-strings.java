class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap <Character,Character> letters = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            letters.put(s.charAt(i),t.charAt(i));
        }
        HashMap <Character,Character> letters1 = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            letters1.put(t.charAt(i),s.charAt(i));
        }
        for(int i=0; i<s.length(); i++){
            if(letters.get(s.charAt(i)) != t.charAt(i) || s.charAt(i) != letters1.get(t.charAt(i))){
                return false;
            }
        }
        return true;
        
    }
}