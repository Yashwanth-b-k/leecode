import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> op = new ArrayList<>();
        HashMap<String, List<String>> hash = new HashMap<>();

        for (String str : strs) {
            // Step 1: Sort the characters in the string to get the "signature"
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            // Step 2: Use the sorted string as a key in the map
            if (!hash.containsKey(sorted)) {
                hash.put(sorted, new ArrayList<>()); // Initialize a new list if key doesn't exist
            }
            hash.get(sorted).add(str); // Add the original string to the list for this key
        }

        // Step 3: Add all lists of anagrams to the final output list
        op.addAll(hash.values());

        return op;
    }
}
