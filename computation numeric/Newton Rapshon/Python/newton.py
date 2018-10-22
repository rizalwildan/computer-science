import math

# initial function
def e(x):
    fx = math.exp(-x) - x
    return fx

# Derivative function
def dev(x):
    dx = -math.exp(-x) - 1
    return dx
    
def newton(x, max_step = 10, tol = 0.0001):
    
    for loopCount in range(max_step):
        p = x - e(x)/dev(x)
        
        # find Approximate root value
        if (abs(p - x) < tol):
            print('Approximate root is', p, 'steps', loopCount)
            break
        
        print('current Approximate', x)
        
        x = p
        
newton(0)