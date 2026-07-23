class Solution {
    public int findGCD(int[] nums) {
        int m = nums[0];
        int n = nums[0];
        for(int i =1;i<nums.length;i++){
            if(m<nums[i]){
                m = nums[i];
            }
            if(n>nums[i]){
                n = nums[i];
            }

        }
        int r = 1;
        for(int i = 2;i<=n;i++){
            if(n%i==0){
                if(m%i==0){
                    r =i;
                }
            }
        }
        return r;

    }
}