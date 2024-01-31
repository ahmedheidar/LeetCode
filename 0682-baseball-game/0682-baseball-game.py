class Solution:
    def calPoints(self, operations: List[str]) -> int:
        r = []
        for o in operations:
            if o == "+":
                r.append(int(r[-1])+int(r[-2]))
            elif o == "D":
                r.append(int(r[-1])*2)
            elif o == "C":
                r.pop()
            else:
                r.append(int(o))
        return sum(r)