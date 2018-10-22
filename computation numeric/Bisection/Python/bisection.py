def func(x):
    return x**3 + x**2 - 3*x - 3
    
def bisec(a, b):
    
    c = a
    
    while ((b-a) >= 0.01):
        
        #cari nilai tengah
        c = (a+b)/2
        
        #check apakah nilai tengah mendekati nol
        if (func(c) == 0.0):
            break
        
        if (func(c)*func(a) < 0):
            b = c;
        else:
            a = c;
            
        print('x1 = ', a, 'x2 = ', b, 'x3 = ', c)
            
    print("The value of root is : ","%.4f"%c, 'approx :', func(c))


bisec(1, 2)