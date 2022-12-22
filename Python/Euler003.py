import time

start_time = time.time()

def factorize(num):
    factors = []
    counter = 2
    while(num > 1):
        if num % counter == 0:
            num /= counter
            factors.append(counter)
        else:
            counter += 1
    return factors

factors = factorize(600851475143)
print("[" + str(int(time.time() - start_time)) + "ms] Solution #3: " + str(factors.pop()))