#write a program that can check whether a program is Practice.palindrome or not

s = input('Enter the string :')
flag = True

for i in range(0,len(s)//2):
    if s[i] != s[len(s) - i - 1]:
        flag = False
        print('Not a Practice.palindrome')
        break
    
if flag :
    print('Practice.palindrome')

        