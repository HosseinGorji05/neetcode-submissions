class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer , Integer> rep = new HashMap<>(); 
        for(int i = 0; i < nums.length; i++){
            if(rep.containsKey(nums[i]) == false){
                rep.put(nums[i] , i);
            } else{
                return true;
            }
        }
        return false;
        }
    }
