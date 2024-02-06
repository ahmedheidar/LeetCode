class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        res = 0
        mySet = set(list(jewels))
        for c in stones:
            if c in mySet:
                res+=1
        return res