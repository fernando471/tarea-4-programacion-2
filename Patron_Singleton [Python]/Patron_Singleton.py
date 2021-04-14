#Singleton

class singleton(type);

_intances = {}

def __call__(cls, *args, **kwargs):


    if cls not in Cls,_instances:
       instances = super().__call__(*args, **kwargs)
       cls,_instances[cls] = instance
     return cls._instances[cls]

class Singleton(metaclass=singleton):



if __name__ == "__main__"

sin1 = singleton()
sin2 = singleton()


if id(sin1) == id (sin2):
    print("Singleton works, both variables contain the same instances")

else:
    print"Singleton failed, variable contain diferents instances")