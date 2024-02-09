class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        operands = []
        
        for t in tokens:
            if t!='+' and t!='-' and t!='*' and t!='/':
                operands.append(int(t))                
            else:
                op2 = operands.pop()
                op1 = operands.pop()
                if t=='+':
                    operands.append(op1+op2)
                elif t=='-':
                    operands.append(op1-op2)
                elif t=='*':
                    operands.append(op1*op2)
                else:
                    operands.append(int(op1/op2))
        return operands.pop()