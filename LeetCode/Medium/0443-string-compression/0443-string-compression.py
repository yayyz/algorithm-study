class Solution:
    def compress(self, chars: List[str]) -> int:
        r, i = 0, 0
        chars_string = ''.join(chars)

        while i < len(chars):
            currChar = chars[i] # curr char 
            charOcc = 0
            while i < len(chars) and chars[i] == currChar:
                charOcc += 1
                i += 1
            chars[r] = currChar
            r += 1
            if charOcc > 1:
                charOccStr = str(charOcc)
                for j in range(len(charOccStr)):
                    chars[r] = charOccStr[j]
                    r += 1
            
        return r
                



            
            


            