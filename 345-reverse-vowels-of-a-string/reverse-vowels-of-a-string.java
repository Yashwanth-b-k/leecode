class Solution {
    public String reverseVowels(String s) {
        StringBuilder rev = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for(int i=0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A'|| c == 'E'|| c == 'I'|| c == 'O'|| c == 'U') {
                rev.append(c);
            }
        }
        rev.reverse();
        int j = 0;
        for(int i=0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A'|| c == 'E'|| c == 'I'|| c == 'O'|| c == 'U') {
                res.append(rev.charAt(j));
                j++;
            }
            else {
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}