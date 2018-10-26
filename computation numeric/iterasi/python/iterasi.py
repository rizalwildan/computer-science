import math

def f(x):
    fx = math.exp(-x)
    return fx

def fixed_point(max_step = 20, tol = 0.0001):
    
    p = 0
    
    loopcounter = 1
    
    for loopcounter in range(max_step):
        
        oldP = f(p)
        
        print('iterasi ke ', int(loopcounter), ' xn ', p, 'e^(xn)', oldP)
        
        if (abs(p - oldP) <= tol):
            print('root value is ', oldP, 'in steps ', int(loopcounter))
            return
            
        p = oldP

fixed_point()