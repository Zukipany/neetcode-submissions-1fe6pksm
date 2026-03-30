class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        chars = []
        for char in t:
            chars.append(char) #alternative is to just to write: chars = list(t)

        result = ""
        for char in s:
            if char in chars:
                result += char
                chars.remove(char)
        t = result
        if t != s:
            return False
        else:
            return True