class Solution {
    public int hammingWeight(int n) {
        int count1s = 0;
        while(n != 0){
            if(n % 2 != 0){
                count1s++;
            } 
            n /= 2;
        }
        return count1s;
    }
}
