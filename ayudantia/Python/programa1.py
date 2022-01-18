import math

a = 3*4
b = (2**2 + 4/2 + 0.5)

# Python program for practical application of sqrt() function

# import math module

# function to check if prime or not


def check(n):
	if n == 1:
		return False

		# from 1 to sqrt(n)
	for x in range(2,int(math.sqrt(n))+1):
		if n % x == 0:
			return False
	return True


# driver code
n = 232
print(n)
print(len(str(n)))
if check(n):
	print("prime")
else:
	print("not prime")


s3a = 3e0*3.65e2*2.4e1*3.6e3

print(type(2 + 5j))
