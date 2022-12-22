import time

start_time = time.time()

sum = 0
for x in range(1, 1000):
    if(x % 3 == 0 or x % 5 == 0): sum += x

print("[" + str(int(time.time() - start_time)) + "ms] Solution #1: " + str(sum))