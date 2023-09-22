//Realizar una función que calcule y retorne la suma de todos los divisores del número n distintos de n. 
//El valor de n debe ser ingresado por el usuario. 

Algoritmo Funciones_EJEXTRA_1
	Definir num1, divisores Como Entero
	Escribir "Ingrese un numero entero"
	Leer num1
	divisores = divisoresDeN(num1) 
		
FinAlgoritmo

Funcion divisores = divisoresDeN(num1)
	Definir i, suma Como Entero
	suma = 0
	Para i = 1 Hasta num1 -1 Hacer
		si num1 mod i == 0 Entonces
			suma = suma + i
			Escribir Sin Saltar i, " "
		FinSi
	FinPara
	Escribir " " 
	Escribir "La suma de los divisores de ", num1, " es igual a: ", suma
FinFuncion
	