class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] Ns = s.split(" ");
        if (pattern.length() != Ns.length) {
            return false;  
        }

        HashMap<Character, String> Hm = new HashMap<>();
        HashMap<String, Character> wordToPattern = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char pChar = pattern.charAt(i);
            String word = Ns[i];

            if (Hm.containsKey(pChar)) {
                if (!Hm.get(pChar).equals(word)) {
                    return false;
                }
            } else {
                if (wordToPattern.containsKey(word)) {
                    if (!wordToPattern.get(word).equals(pChar)) {
                        return false;
                    }
                }

                Hm.put(pChar, word);
                wordToPattern.put(word, pChar);
            }
        }

        return true;
    }
}