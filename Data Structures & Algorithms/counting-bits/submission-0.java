class Solution {
    public int[] countBits(int n) {
        int[] numsBits = new int[n + 1];
        for(int i = 0; i <= n; i++){
            numsBits[i] = hammingWeight(i);
        }

        return numsBits;
    }


    public int hammingWeight(int n){
        int count = 0;
        while(n != 0){
            if(n % 2 != 0){
                count++;
            }
            n /= 2;
        }
        return count;
    }
}
