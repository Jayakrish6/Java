# -*- coding: utf-8 -*-
"""
Created on Sat May  4 09:25:21 2019

@author: Jay
"""
import numpy as np
import random

def createClusterdData(N, k):
    pointsPerCluster = float(N)/k
    X = []
    Y = []
    for i in range(k):
        incomeCentroid = random.uniform(20000.0, 20000.0)
        ageCentroid = random.uniform(20.0, 70.0)
        for j in range(int(pointsPerCluster)):
            X.append([np.random.normal(incomeCentroid, 10000.0), np.random.normal(ageCentroid, 2.0)])
            Y.append(i)
            
    X = np.array(X)
    Y = np.array(Y)
    return X, Y

(X, Y) = createClusteredData(100, 5)
