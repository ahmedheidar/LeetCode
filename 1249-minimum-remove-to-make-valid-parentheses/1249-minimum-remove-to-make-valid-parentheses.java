class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> set = new HashSet<>();
        char[] arr = s.toCharArray();
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='(')
                stack.push(i);
            else if(c==')'){
                if(stack.isEmpty())
                    arr[i]='*';
                else
                    stack.pop();
            }
        }
        
        while(!stack.isEmpty())
            arr[stack.pop()] = '*';
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]!='*')
                sb.append(arr[i]);
        }
        
        return sb.toString();
        
    }
}