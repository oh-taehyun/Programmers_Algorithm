a,b,c = map(int,input().split())

def reward(a,b,c):
    if a==b==c:
        return 10000+a*1000
    elif a==b or a==c or b==c:
        if a==b or a==c:
            return 1000+a*100
        elif b==c:
            return 1000+b*100
    else:
        if a>b>c or a>c>b:
            return a*100
        elif b>a>c or b>c>a:
            return b*100
        elif c>a>b or c>b>a:
            return c*100

print(reward(a,b,c))