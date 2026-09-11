class Solution {
    public boolean isValid(String s) {

        if(s.length() < 2){
            return false;
        }

        Map<Character, Character> pairs = new HashMap<>();
        pairs.put('(', ')');
        pairs.put('{', '}');
        pairs.put('[', ']'); 
        Stack<Character> stack = new Stack<>();

        if(!pairs.containsKey(s.charAt(0))){
            return false;
        }
        
        for(int i = 0; i < s.length(); i++){
            if(pairs.containsKey(s.charAt(i))){
                stack.push(s.charAt(i));
            } else if(stack.isEmpty() || s.charAt(i) != pairs.get(stack.pop())){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
