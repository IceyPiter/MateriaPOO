import time

a = 10 
print(f'Você tem 10 Segundos para me dar 10 pila')
time.sleep(3)

for i in range(10):
    if i <= 4:
        print(f'Você tem {a-i} Segundos')
    elif i < 8:
        print(f'Agora você tem {a-i} Segundos, já ta me deixando puto parceiro!!!')
    elif i >= 8:
        print(f'Você tem {a-i} Segundos, MANO VAI LOGOO!!')
    time.sleep(1)
for f in range(1000):
    print("BRUHHHHHHH")
print("Se fodeu agora ta me devendo!!")