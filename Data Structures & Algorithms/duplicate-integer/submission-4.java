class Solution {
    public boolean hasDuplicate(int[] nums) {
        int current;
        for(int i= 0; i < nums.length; i++){
            for (int j = 1; j < nums.length; j++){
                current = nums[j];
                if (nums[i] == current && i != j ){
                    return true;
                }
            }
        }
        return false;
        }
    }
