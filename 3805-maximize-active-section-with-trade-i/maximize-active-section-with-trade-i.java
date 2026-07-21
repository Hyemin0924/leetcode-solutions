class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int n = 0;
        int c = 0;
        int p = 0;
        int r = 0;
        int pos = 0;
        int b = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0'){
                if(n==0){
                    r = r+1;
                    n = 1;
                }
                else if(n==1){
                    r = r+1;
                }
                else if(n==2){
                    r = r+1;
                    b = b+1;
                    c = 1;
                    n =3;
                }
                else if(n==3){
                    r= r+1;
                    b = b+1;
                }
            }
            else if(s.charAt(i) == '1'){
                pos = pos +1;
                if(n==1){
                    n=2;
                }
                else if(n==3){
                    p = Math.max(p, r);
                    r = b;
                    n =2;
                    b=0;
                }
            }
            
            
        }
        if(c==1){
                p = Math.max(p, r);
            }
            return (pos + p);
    }
}