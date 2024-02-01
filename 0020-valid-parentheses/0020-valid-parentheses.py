class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for b in s:
            if b=="(" or b=="[" or b=="{":
                stack.append(b)
            elif b==")":
                if len(stack)==0:
                    return False
                x = stack.pop()=="("
                if x==False:
                    return False
            elif b=="]":
                if len(stack)==0:
                    return False
                x = stack.pop()=="["
                if x==False:
                    return False
            elif b=="}":                
                if len(stack)==0:
                    return False
                x = stack.pop()=="{"
                if x==False:
                    return False
        if len(stack)==0:
            return True
        else:
            return False
            
                