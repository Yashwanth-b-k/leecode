class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> re = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            if(re.containsKey(magazine.charAt(i))){
                re.put(magazine.charAt(i),re.get(magazine.charAt(i))+1);
            }else{
                re.put(magazine.charAt(i),1);
            }
        }
        for(int i=0;i<ransomNote.length();i++){
            if(!re.containsKey(ransomNote.charAt(i)) || re.get(ransomNote.charAt(i)) == 0) return false;
            if(re.containsKey(ransomNote.charAt(i))){
                re.put(ransomNote.charAt(i),re.get(ransomNote.charAt(i))-1);
            }
        }
        return true;
    }
}
