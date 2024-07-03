class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        ptr1, ptr2 = -1, 1
        size = len(flowerbed)

        if size == 0:
            return False
        if n == 0:
            return True

        def isAdjacent(ptr1, ptr2):
            if ptr1 < 0 and ptr2 >= size: # size 1
                return not flowerbed[ptr1 + 1]
            elif ptr1 < 0: # start of an array 
                return not flowerbed[ptr2]
            elif ptr2 >= size: # end of an array 
                return not flowerbed[ptr1]             
            else:
                return not flowerbed[ptr1] and not flowerbed[ptr2]

        for i in range(size):
            # print("curr flowerbed i", i)
            # print("curr flowerbed", flowerbed[i])
            # print("ptr1, ptr2", ptr1, ptr2)
            if not flowerbed[i]:
                if isAdjacent(ptr1, ptr2):
                    n -= 1
                    flowerbed[i] = 1
                    # print("-----------")
                    # print("n is", n)
                    # print("updated flowerbed", flowerbed)
                    # print("-----------")
            if n == 0: 
                return True
            ptr1 += 1
            ptr2 += 1

        return False         