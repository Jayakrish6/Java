# -*- coding: utf-8 -*-
"""
Created on Sat May 18 03:02:09 2019

@author: Jay
"""

import numpy.matlib 
import numpy as np 

a = np.array([[1,2],[3,4]]) 
b = np.array([[11,12],[13,14]]) 
print(np.dot(a,b))


import numpy as np 
from matplotlib import pyplot as plt 

x = np.arange(1,11) 
y = 2 * x + 5 
plt.title("Matplotlib demo") 
plt.xlabel("x axis caption") 
plt.ylabel("y axis caption") 
plt.plot(x,y) 
plt.show()

a = np.array([1, 2, 3], dtype = complex) 
print (a)