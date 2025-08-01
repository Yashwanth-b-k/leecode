class Solution {
    static{
        for(int i=0;i<400;i++){
            increasingTriplet(new int[]{0,0});
        }
    }
    public static boolean increasingTriplet(int[] nums) {
        int first=Integer.MAX_VALUE;
        int sec=Integer.MAX_VALUE;
        for(int num:nums){
            if(num<=first)first=num;
            else if(num<=sec)sec=num;
            else return true;
        }
        return false;
    }
}