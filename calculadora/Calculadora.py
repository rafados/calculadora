# -*- coding: utf-8 -*-
#Función que suma los dos parametros y devuelve el resultado.
def sumar(num1,num2):
    resultado = num1 + num2
    return resultado


#Función que resta los dos parametros y devuelve el resultado.
def restar(num1,num2):
    resultado = num1 - num2
    return resultado


#Función que multiplica los parámetros y delvuelve el resultado.
def multiplicar(num1,num2):
    resultado = num1 * num2
    return resultado


"""Función que divide los parámetros (numerador, denominador) y devuelve el resultado.
Lanza una excepción en caso de división por cero. El código de esa excepción mostrará
el mensaje 'ERROR: No se puede dividir por cero' y lanzará una excepción del tipo
ZeroDivisionError."""
def dividir(dividendo,divisor):
    try:
        resultado = dividendo / divisor
        return resultado
    except ZeroDivisionError:
        raise ZeroDivisionError("El divisor no puede ser cero")
        return

