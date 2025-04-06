class Solution {
    public boolean isPalindrome(int n) {
        int org=n;
        int rev=0;
        while(n!=0){
            int temp=n%10;
            rev=rev*10+temp;
            n=n/10;
        }
        if(rev!=org||rev<0||n<0)
            return false;
        else
            return true;
    }
}