from random import randint

class Persona():
    nombre = ""
    correo = ""
    telefono = ""
    materias = []

    def __init__(self,nombre, correo, telefono, archivo):
        
        self.nombre = nombre + str(randint(0, 100))
        self.correo = correo
        self.telefono = telefono

        f = open(archivo, "r")
        materias = f.read().split()
        #self.materias = new ArrayList < String > ()
        print(materias)


#a = Persona("Lalo", "lalo@a.com", "55555555", "E:/Ulmo/Documentos/Compu/Materias/Progra/Programacion-9146/ayudantia/output.txt")
a = Persona("Lalo", "lalo@a.com", "55555555", "/../ejemplo/materias.txt")



        
