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