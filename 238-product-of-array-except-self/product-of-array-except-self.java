class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int n = nums.length;
        int pre[] = new int[n];
        int pos[] = new int[n];
        int res[] = new int[n];
        for(int i=0; i<n; i++){
            product *= nums[i];
            pre[i] = product;
        }

        product = 1;
        for(int j=n-1; j>=0; j--){
            product *= nums[j];
            pos[j] = product;
        }
        res[0] = 1*pos[1];
        res[n-1] = pre[n-2]*1;
        for(int k=2;k<n;k++){
            res[k-1] = pre[k-2] * pos[k];
        }

        return res;
    }
}