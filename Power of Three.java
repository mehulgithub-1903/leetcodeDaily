class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        int k=1162261467;
        return k%n==0;
    }
}
