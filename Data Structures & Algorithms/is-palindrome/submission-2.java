class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 1 || s.length() == 0){
            return true;
        }
        String correct = s.replaceAll("[^a-zA-Z0-9]" , "");
        for(int i = 0; i < correct.length(); i++){
            if(Character.toLowerCase(correct.charAt(i)) != Character.toLowerCase(correct.charAt(correct.length() - (i + 1)))){
                return false;
            }
        }
        return true;
    }
}
