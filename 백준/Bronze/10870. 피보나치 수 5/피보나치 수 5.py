Num = int(input())

def Fibonacci(Num):
    if Num < 3:
        if Num == 0:
            return 0
        else:
            return 1
    
    else:
        return Fibonacci(Num-1)+Fibonacci(Num-2)

print(Fibonacci(Num))