class Solution {
    public int minAddToMakeValid(String s) {
        int res = 0;
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='(')
                stack.push(c);
            else
                if(stack.isEmpty())
                    res++;
                else
                    stack.pop();
        }
        
        while(!stack.isEmpty()){
            stack.pop();
            res++;
        }
       return res;
    }
}