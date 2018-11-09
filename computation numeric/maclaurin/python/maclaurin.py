import math

def maclaurin(x, terms):
    cos = 0
    for n in range(terms):
        cos += ((-1)**n) * (x ** (2*n)) / (math.factorial(2 * n))
    return cos

print(maclaurin(1, 10))