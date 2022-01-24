cadena = "W"
cadena = "Hola Mundo"
print(cadena,"Mi tipo es",type(cadena), ".")

cadena2 = cadena, "Mi tipo es", type(cadena), "."
cadena3 = str((cadena, "Mi tipo es", type(cadena), "."))


print("Cadena 2",cadena2,type(cadena2))
print("Cadena 3",cadena3,type(cadena3))
print("Cadena 3 len",len(cadena3))

# String Slicing
#Toma desde la posicion 1 hasta el final 
cadena4 = cadena3[1:]

#Toma desde la posicion 0 hasta el -3.
cadena4 = cadena3[:-3]



cadena4 = cadena3[1:len(cadena3)-1]
# lo de arriba es equivalente a esta...
cadena4 = cadena3[1 : -1]

cadena4 = cadena4.replace("'","",4)
cadena4 = cadena4.replace("'","#",2)
cadena4 = cadena4.replace("'","")
cadena4 = cadena4.replace("#","'")
cadena4 = cadena4.replace(",","")


print("Cadena 1", cadena + " Mi tipo es " + str(type(cadena))+" .")
print("Cadena 4",cadena4,type(cadena4))
assert(cadena4 == cadena + " Mi tipo es "+  str(type(cadena))+" .")



# La notacion de slices con 3 : osea ::: se refiere a inicio:fin:pasos(de cuantos en cuantos caracteres quieres.) 
cadena5 = cadena4[::-1]


print("Cadena 5", cadena5)