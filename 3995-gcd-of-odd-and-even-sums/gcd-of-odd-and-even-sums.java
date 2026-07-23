class Solution {
    public int gcdOfOddEvenSums(int n) {
        int e = 0;
        int o = 0;
        for(int i =0;i<n;i++){
            e = e + i*2;
            o = o + i*2 +1;
        }
        int g = 1;
        for(int i = 2; i<o;i++){
            if(o%i==0){
                if(e%i==0){
                    g = i;
                }
            }
        }
        return g;
    }
}