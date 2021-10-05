# -*- coding: utf-8 -*-
"""
Programa para mostrar un menú básico

Curso: Programación 2022-1

Detalles: Uso de if /elif /else
          while - else

Fecha: 4 -Oct - 2021
"""

class ClaseMenuInfinito:
    
    seleccion = '1';
    
    while seleccion != '6':
        print("Qué medida de tendencia central requieres: ")
        print("1.- Moda \n" +
              "2.- Mediana \n" +
              "3.- Media Aritmética \n" +
              "4.- Media Geométrica \n" +
              "5.- Media Armónica  \n" +
              "6.- TERMINA EL PROGRAMA")
        seleccion = input("Selecciona el número de operación que quieras: ")
           
         

        print("Tu selección fue: " + seleccion);

        if '1' == seleccion:
             print("Tu selección fue \"moda\" ")
        elif '2' == seleccion:
            print("Tu selección fue \"mediana\" ")
        elif '3' == seleccion:
            print("Tu selección fue \"media aritmética\" ")
        elif '4' == seleccion:
            print()
        else:
            print("Tu selección fue \"media armónica\", te gusta la física ¿verdad? ");
    
    else:
        print("Bye")