class Solution {
    public int reverse(int n) {
        int x=Math.abs(n);
        int s=0,r=0;
        while(x!=0){
            r=x%10;
            if(s>(Integer.MAX_VALUE-r)/10) {
                return 0;
            }
            s=s*10+r;
            x/=10;
        }
        return (n<0)?(-s):s; 
    }
}