class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        boolean[] isVowel = new boolean[128];
        for (char c : new char[] { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' })
            isVowel[c] = true;

        int left = 0, right = chars.length - 1;
        while (left < right) {
            if (!isVowel[chars[left]]) {
                left++;
            } else if (!isVowel[chars[right]]) {
                right--;
            } else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
}