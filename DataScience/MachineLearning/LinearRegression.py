# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""
# Imports
import matplotlib.pyplot as plt
import matplotlib as mpl
import pandas as pd
import seaborn as sns
import sklearn
import numpy as np
from sklearn.model_selection import train_test_split

df = pd.read_csv('D:\MyDoc\Study\DataScience\Python\linear-regression-sklearn-master\challenge_dataset.txt', names=['X','Y'])
sns.regplot(x='X', y='Y', data=df, fit_reg=False)
plt.show()

X_train, X_test, y_train, y_test = np.asarray(train_test_split(df['X'], df['Y'], test_size=0.1))

from sklearn.linear_model import LinearRegression

reg = LinearRegression()
reg.fit(X_train.values.reshape(-1,1), y_train.values.reshape(-1,1))

print('Score: ', reg.score(X_test.values.reshape(-1,1), y_test.values.reshape(-1,1)))
