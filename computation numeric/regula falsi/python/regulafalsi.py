import math;

maxStep = 30;
tolerance = 0.0001;

def func(x):
    "3x + sin x - e^x"
    return x ** 3 + x ** 2 - 3 * x - 3;
    
def regula_falsi(a, b, max_steps = maxStep, tol = tolerance):
    
    p = 0.0;
    i = 0;
    for loopCount in range(max_steps):
        p = b - (func(b) * ((a-b)/(func(a)-func(b))))
        print("Current approximation is %.9f" % p)
        if math.copysign(func(a), func(b)) != func(a):
            b = p
        else:
            a = p
        if abs(func(p)) < tolerance:
            print("Root is %.9f (%d iterations)" % (p,int(loopCount)))
            return
    print("Root find cancelled at %.9f" % p)

regula_falsi(1, 2);