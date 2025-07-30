class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ex = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i:candies) {
            max = Math.max(max, i);
        }
        for(int i:candies) {
            if(max > i+extraCandies) {
                ex.add(false);
            } else {
                ex.add(true);
            }
        }
        return ex;
    }
}