
# Instance Variable
class Person:
    
    def __init__(self,name_input,country_input):
        self.name = name_input
        self.country = country_input

p1 = Person('nitish','India')
p2 = Person('steve','Australia')

print(p2.name)