class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        for(int i=0;i<nums.length;i++){
            int r = target - nums[i];
            for(int j=0;j<nums.length;j++){
                if(i != j && r == nums[j]){
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }
}