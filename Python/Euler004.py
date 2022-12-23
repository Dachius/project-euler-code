import time

start_time = time.time()

def is_palindrome(num):
    return str(num) == str(num)[::-1]

largest = 0
for x in range(1, 1000):
    for y in range(1, 1000):
        if(is_palindrome(x * y)):
            largest = max(largest, x * y)

print("[" + str(int(1000 * (time.time() - start_time))) + "ms] Solution #4: " + str(largest))