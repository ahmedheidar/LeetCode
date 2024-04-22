class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == '(') {
                stack.push(i); 
            } else if (ch == ')') {
                int start = stack.pop(); 
                reverseSubstring(sb, start + 1, i - 1); 
            }
        }
        
        System.out.println(sb);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != '(' && sb.charAt(i) != ')') {
                result.append(sb.charAt(i));
            }
        }

        return result.toString();
    }

    private static void reverseSubstring(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }
}