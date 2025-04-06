class Solution {
    public int getSum(int a, int b) {
        int c=a^b;
        int carry=a&b;
        if(carry==0)
            return c;
        else
            return c+(carry<<1);
    }
}