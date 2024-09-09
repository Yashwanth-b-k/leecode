class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int start = 0;
        int end = height.length - 1;
        while(start < end){
            int small;
            if(height[start] > height[end]) small = end;
            else small = start;
            if(max < height[small] *(end - start))
                max = height[small] *(end - start);
            else if(small == start){
                start++;
            }else{
                end--;
            }
        }

        return max;
    }
}