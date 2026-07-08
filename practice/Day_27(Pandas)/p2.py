# Series Using read_csv
import pandas as pd
import numpy as np

# With one column
subs = pd.read_csv(r'C:\Users\HP\Desktop\python progamming\practice\Day_27(Pandas)\subs.csv').squeeze('columns')
print(subs)

# With two column
kohli = pd.read_csv(r'C:\Users\HP\Desktop\python progamming\practice\Day_27(Pandas)\kohli_ipl.csv',index_col = 'match_no').squeeze('columns')
print(kohli)

movies = pd.read_csv(r'C:\Users\HP\Desktop\python progamming\practice\Day_27(Pandas)\bollywood.csv',index_col = 'movie').squeeze('columns')
print(movies)


# Series Methods
# Head and Tail
print(subs.head(3))
print(subs.tail(3))

# Sample

print(movies.sample(5))

# value_counts
print(movies.value_counts())

# Sort_values
print(kohli.sort_values())

#sort_index
movies.sort_index(inplace = True)
print(movies)

# Series Maths Methods
# Count and Sum and product
print(kohli.count())  
print(subs.sum())

print(subs.product())

# Mean / Median / Mode / Standard Deviation / variance
print(kohli.mean())
print(subs.median())
print(subs.mode())
print(subs.std())
print(subs.var())

# Min / max
print(subs.min())
print(subs.max())

# Describe
print(kohli.describe())


# Series Indexing and Slicing
# Integer Indexing

x = pd.Series([1,2,3,4,5])
print(x[0])

'''negative indexing is not supported in series, It only works for text based indexing.'''

print(movies['3 Idiots'])
print(movies[0])

# Slicing
print(subs[0:3])
print(kohli[5:10])

print(kohli[-5:-1])
print(kohli[-10:-5])
print(kohli[::2])


# Fancy Indexing
print(subs[[0,2,4]])


# Editing In series
marks_series = pd.Series([10,20,30,40,50])
marks_series[0] = 100
print(marks_series)

# What if index does not exist in series
