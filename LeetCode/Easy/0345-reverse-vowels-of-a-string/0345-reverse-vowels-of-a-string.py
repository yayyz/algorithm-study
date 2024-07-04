class Solution:
    def reverseVowels(self, s: str) -> str:
        size = len(s)
        vowel_map = ["a", "e", "i","o","u", "A", "E", "I", "O", "U"]
        ptr1, ptr2 = 0, size -1
        s_list = list(s)
    
        while ptr1 < ptr2: 
            if s_list[ptr1] not in vowel_map:
                ptr1 += 1
            if s_list[ptr2] not in vowel_map:
                ptr2 -= 1

            if s_list[ptr1] in vowel_map and s_list[ptr2] in vowel_map:
                tmp = s_list[ptr1]
                s_list[ptr1] = s_list[ptr2]
                s_list[ptr2] = tmp
                ptr1 += 1
                ptr2 -= 1

        return ''.join(s_list)
            

