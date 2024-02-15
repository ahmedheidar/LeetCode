class Solution:
    def decodeMessage(self, key: str, message: str) -> str:
        map = {}
        ascii = 97
        for c in key:
            if c not in map and c.isalpha():
                map[c] = ascii
                ascii += 1
        result = ""
        for c in message:
            if c in map:
                result += chr(map[c])
            else:
                result += c
        return result