n,m = map(int, input().split())

graph = []
for i in range(n):
    graph.append(list(input()))

def dfs1(x,y):
    if x <0 or x >= n or y <0 or y >= m:
        return
    if graph[x][y] == '-':
        graph[x][y] = 'X'
        dfs1(x , y-1)
        dfs1(x, y+1)
        return True
    
    return False
def dfs2(x,y):
    if x <0 or x >= n or y <0 or y >= m:
        return
    if graph[x][y] == '|':
        graph[x][y] = 'X'
        dfs2(x -1 , y)
        dfs2(x+1,y)
        return True
    
    return False

result=0
for i in range(n):
    for j in range(m):
        if dfs1(i,j)== True:
            result +=1
        if dfs2(i,j)== True:
            result +=1
print(result)