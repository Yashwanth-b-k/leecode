class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        int op[] = new int[2];
        while(start < end){
            int sum = numbers[start] + numbers[end];
            if(sum == target){
                op[0] = start+1;
                op[1] = end+1;
            }
            if(sum > target){
                end--;
            }else{
                start++;
            }
        }
        return op;
    }
}