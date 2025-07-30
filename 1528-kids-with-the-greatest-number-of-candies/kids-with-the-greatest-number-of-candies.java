class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ex = new ArrayList<>();
        int max = 0;
        for(int i:candies) {
            max = Math.max(max, i);
        }
        for(int i:candies) {
            ex.add(i + extraCandies >= max);
        }
        return ex;
    }
}