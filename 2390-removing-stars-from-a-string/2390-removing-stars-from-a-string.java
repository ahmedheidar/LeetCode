class Solution {
    public String removeStars(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Character> stack = new Stack();
        
        for(char c: s.toCharArray()){
            stack.push(c);
            if(c=='*'){
                stack.pop();
                stack.pop();
            }
        }
        
        while(!stack.isEmpty()){
            res.insert(0, stack.pop());
        }
        
        return res.toString();
    }
}