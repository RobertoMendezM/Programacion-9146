archivo = open("texto.csv","r")
#header = archivo.readline()
#linea2 = archivo.readline()

for linea in archivo:
    print(linea)


#########################################3

with open('texto.csv') as archivo2:
    for linea in archivo2:
        print(linea)

