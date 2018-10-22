import math

def e(x):
    fx = math.exp(-x) - x
    return fx

def secant(x1, x2, max_step = 20, tol = 0.0001):
    
    loopCount = 1
    
    for loopCount in range(max_step):
        
        p = x2 - (e(x2) * ((x1 - x2) / (e(x1) - e(x2))))
        
        print('f(x',loopCount - 1,')', e(x1), 'f(x',loopCount,')', e(x2))
        
        print('x',int(loopCount + 1), '=', p, '\n')
        
        if (abs(e(p)) < tol):
            print('root is', p, 'iteration', loopCount + 1)
            return
        
        x1 = x2
        x2 = p
    
    print('Root find stopped at', p)
        
    
secant(0, 1)