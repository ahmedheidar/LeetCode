class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        stack = []
        res = []
        
        def GP(op, cp):
            if op == cp == n:
                res.append("".join(stack))
                return
            if op < n:
                stack.append('(')
                GP(op+1, cp)
                stack.pop()
            if cp < op:
                stack.append(')')
                GP(op, cp+1)
                stack.pop()
        
        GP(0, 0)
        return res