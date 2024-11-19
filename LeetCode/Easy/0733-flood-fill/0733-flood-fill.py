class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        # horizontal, vertical move
        directions = [(-1, 0), (1,0), (0,-1), (0,1)]
        rows, cols = len(image), len(image[0])
        visited = set()

        # bfs queue
        queue = deque([(sr,sc)])
        original_color = image[sr][sc]

        while queue: 
            x,y = queue.popleft()

            if (x,y) in visited: 
                continue

            visited.add((x,y))

            if image[x][y] == original_color: 
                image[x][y] = color

                for dx, dy in directions: 
                    nx,ny = x + dx, y + dy
                    if 0 <= nx < rows and 0 <= ny < cols and (nx, ny) not in visited: 
                        queue.append((nx,ny))
        
        return image

