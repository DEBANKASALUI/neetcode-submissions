class Solution {
    public int reverse(int x) {
        int counter=0;
        int rev=0;
        if(x<0){
            if (x == Integer.MIN_VALUE) return 0;
            x=Math.abs(x);
            counter=1;
        }
        while(x!=0){
            int digit=x%10;
            if (rev > (Integer.MAX_VALUE - digit) / 10) return 0;
            rev=rev*10+digit;
            x/=10;
        }
        if(counter==1) return Math.negateExact(rev);
        else return rev;
    }
}
