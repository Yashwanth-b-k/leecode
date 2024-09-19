class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums.length == 0) return res;

        int start = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // if the current number is not consecutive, finish the current range
            if (nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1]) {
                    res.add(String.valueOf(start)); // Single number range
                } else {
                    res.add(start + "->" + nums[i - 1]); // Range with multiple numbers
                }
                start = nums[i]; // start a new range
            }
        }

        // Add the last range
        if (start == nums[nums.length - 1]) {
            res.add(String.valueOf(start));
        } else {
            res.add(start + "->" + nums[nums.length - 1]);
        }

        return res;
    }
}
