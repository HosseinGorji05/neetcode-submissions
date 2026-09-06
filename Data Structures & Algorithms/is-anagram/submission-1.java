class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character , Integer> freqs = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            freqs.merge(s.charAt(i) , 1 , Integer::sum);
        }

        Map<Character , Integer> freqt = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            freqt.merge(t.charAt(i) , 1 , Integer::sum);
        }


        for(int j = 0; j < s.length(); j++){
            if(freqt.containsKey(s.charAt(j)) == false){
                return false;
            }
            if(!freqt.get(s.charAt(j)).equals(freqs.get(s.charAt(j)))){
                return false;
            }
        }
        return true;

    }
}
