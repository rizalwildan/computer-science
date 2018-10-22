import math

def e(x):
    fx = math.exp(-x) - x
    return fx

def tabulate(x, max_step = 10):
    
    print('Search square root equation 1')
    for i in range(max_step):
        temp = e(x)
        
        if (temp < 0):
            print('Root find at', x, 'aprox', temp, '\n')
            break
        
        print('x = ', x,'aprox =', temp)
        
        x = x + 0.1
        
    x2 = x - 0.1
    tabulate2(x2)
    
def tabulate2(x, max_step = 10):
    
    print('Search square root equation 2')
    for i in range(max_step):
        temp = e(x)
        
        if (temp < 0):
            print('Root find at', x, 'aprox', temp, '\n')
            break
        
        print('x = ', x,'aprox =', temp)
        
        x = x + 0.01
    x3 = x - 0.01
    tabulate3(x3)

def tabulate3(x, max_step = 10):
    
    print('Search square root equation 3')
    for i in range(max_step):
        temp = e(x)
        
        if (temp < 0):
            print('Root find at', x, 'aprox', temp, '\n')
            break
        
        print('x = ', x,'aprox =', temp)
        
        x = x + 0.001

tabulate(0)
