# Functions of Numpy

import numpy as np

a = np.random.randint(1,100,25)
b = np.random.randint(1,100,24).reshape(6,4)

print(a)
print(b)

'''np.sort() function is used to sort an array in ascending order.
Syntax: numpy.sort(a, axis=-1, kind='quicksort', order=None)'''

# print(np.sort(a))
# print(np.sort(b))
# print(np.sort(b,axis=0)[::-1])
# print(np.sort(a)[::-1])


'''np.append() function is used to append values to the end of an array.
Syntax: numpy.append(arr, values, axis=None)'''

# print(np.append(a,200))
# print(np.append(b,200))
# print(np.append(b,np.ones((b.shape[0],1)),axis=1))
# print(np.append(b,np.ones((1,b.shape[1])),axis=0))

'''np.concatenate() function is used to join two or more arrays of the same shape along a specified axis.
Syntax: numpy.concatenate((a1, a2, ...), axis=0, out=None'''

# c = np.arange(6).reshape(2,3)
# d = np.arange(6,12).reshape(2,3)

# print(c)
# print(d)

# print(np.concatenate((c,d),axis =0))
# print(np.concatenate((c,d),axis =1))

'''np.unique() function is used to find the unique elements of an array.
Syntax: numpy.unique(a, return_index=False, return_inverse=False, return_counts=False)'''

# e = np.array(([1,1,2,2,3,3,4,4,5,5,6]))
# print(np.unique(e))
# print(np.unique(e,return_counts=True))

'''np.expand_dims() function is used to expand the shape of an array by adding a new axis at the specified position.
Syntax: numpy.expand_dims(a, axis)'''

# print(np.expand_dims(a,axis=0))
# print(np.expand_dims(a,axis=1))
# print(np.expand_dims(b,axis = 0))
# print(np.expand_dims(b,axis = 1))

'''np.where() function is used to return the indices of elements in an input array that satisfy a given condition.
Syntax: numpy.where(condition[, x, y])'''

# print(np.where(a>50))
# print(np.where(a>50,0,a))

'''np.argmax() function is used to return the indices of the maximum values along an axis.
Syntax: numpy.argmax(a, axis=None, out=None)'''

# print(np.argmax(a))
# print(np.argmax(b,axis=0))
# print(np.argmax(b,axis=1))

'''np.argmin() function is used to return the indices of the minimum values along an axis.
Syntax: numpy.argmin(a, axis=None, out=None)'''

# print(np.argmin(a))
# print(np.argmin(b,axis=0))
# print(np.argmin(b,axis=1))


print()