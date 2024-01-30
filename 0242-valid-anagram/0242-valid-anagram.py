class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if(len(s) != len(t)):
            return False
        hashmap = {}
        for c in s:
            if c in hashmap:
                hashmap[c] += 1
            else:
                hashmap[c] = 1
        for c in t:
            if c not in hashmap:
                return False
            else:
                hashmap[c] -= 1
                if(hashmap[c] == 0):
                    hashmap.pop(c)
        return True