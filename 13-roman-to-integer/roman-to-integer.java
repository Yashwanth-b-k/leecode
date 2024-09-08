class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        
        int n = s.length()-1;

        int res = roman.get(s.charAt(n));
        for(int i=s.length()-1;i>0;i--){
            if(roman.get(s.charAt(i)) > roman.get(s.charAt(i-1))){
                res = res - roman.get(s.charAt(i-1));
            }
            else{
                res = res + roman.get(s.charAt(i-1));
            }
        }
        return res;
    }
}