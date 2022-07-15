class Solution {
    public boolean isValid(String s) {
                Stack<Character> stack = new Stack<>();
        char[] brackets = s.toCharArray();
        for (char bracket:brackets) {
            if(bracket=='[' || bracket=='(' || bracket=='{'){
                stack.push(bracket);
            }else{
                if(!stack.isEmpty()) {
                    if (bracket == ')') {
                        if (stack.pop() != '(') {
                            return false;
                        }
                    } else if (bracket == '}') {
                        if (stack.pop() != '{') {
                            return false;
                        }
                    } else {
                        if (stack.pop() != '[') {
                            return false;
                        }
                    }
                }else return false;
            }
        }
        return stack.isEmpty();


    }
}