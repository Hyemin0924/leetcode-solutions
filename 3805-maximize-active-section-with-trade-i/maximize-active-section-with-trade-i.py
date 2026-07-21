class Solution:
    def maxActiveSectionsAfterTrade(self, s: str) -> int:
        n = 0
        c= 0
        p = []
        r = 0
        pos = 0
        b = 0
        for i in range(len(s)):
            if(s[i]=="0"):
                if(n==0):
                    r = r+1
                    n =1
                elif(n==1 ):
                    r = r+1
                elif(n==2):
                    r = r+1
                    b =b+1
                    c=1
                    n=3
                elif(n==3):
                    r = r+1
                    b= b+1
            elif(s[i]=="1"):
                pos = pos+1
                if(n==1):
                    n=2
                elif(n==3):
                    p.append(r)
                    r = b
                    n = 2
                    b=0
        if(c==1):    
            p.append(r)
        if(len(p)!=0):
            return pos + max(p)
        return pos
                    