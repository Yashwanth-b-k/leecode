class Solution {
    public String intToRoman(int num) {
        int[] n = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] s = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder str = new StringBuilder(); // Use StringBuilder for efficiency
        int i = 0;
        
        while (num > 0) {
            while (num >= n[i]) { // Use while instead of if, reducing iterations
                str.append(s[i]);  // Efficiently append instead of using concatenation
                num -= n[i];
            }
            i++;
        }
        
        return str.toString(); // Convert StringBuilder back to a String
    }
}
