import time

start_time = time.time()

sum = 0
fibs = [0, 1, 1]
while fibs[2] < 4000000:
    if fibs[2] % 2 == 0:
        sum += fibs[2]

    # shift nums over, generate next fibonacci number
    fibs[0] = fibs[1]
    fibs[1] = fibs[2]
    fibs[2] = fibs[0] + fibs[1]

print("[" + str(int(1000 * (time.time() - start_time))) + "ms] Solution #2: " + str(sum))