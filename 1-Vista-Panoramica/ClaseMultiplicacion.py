# -*- coding: utf-8 -*-
"""
Programa que define una CLase

Curso: Programación

Detalles: Usa la funciòn str(), pone de manifiesto la diferencia
entre , y + en print().

Fecha: 1 -Oct - 2021
"""
class ClaseMultiplica:
    a = float(input("Dame el nùmero a: "))
    b = float(input("Dame el nùmero b: "))
    
    # Esta marca error
    #print("El resltado de a*b = " + a*b )

    print("El resltado de a*b = ", a*b )
    
    # Otra forma
    # Uso de + y la función str()
    print("El resltado de b*a = " +  str(a*b))