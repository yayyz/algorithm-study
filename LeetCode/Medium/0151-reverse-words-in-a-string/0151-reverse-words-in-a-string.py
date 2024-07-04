class Solution:
    def reverseWords(self, s: str) -> str:
        # remove trailing spaces 
        s = s.strip()
        # create an array
        s_list = s.split(' ')

        # remove spaces
        index = 0
        while len(s_list) > index:
            if s_list[index] == "":
                s_list.pop(index)
            else:
                index += 1

        ptr1, ptr2 = 0, len(s_list) - 1
        while ptr1 < ptr2:
            tmp = s_list[ptr1]
            s_list[ptr1] = s_list[ptr2]
            s_list[ptr2] = tmp 
            ptr1 += 1
            ptr2 -= 1      
        
        return ' '.join(s_list)