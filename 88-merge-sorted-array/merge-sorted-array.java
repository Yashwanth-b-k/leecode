class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int M=m-1;
       int N=n-1;
       int MN=m+n-1;
        while(N>=0){
        if(M>=0 && nums1[M] > nums2[N]){
            nums1[MN] = nums1[M];
            M--;
        }else{
            nums1[MN] = nums2[N];
            N--;
        }
            MN--;
        
       }
    }
}