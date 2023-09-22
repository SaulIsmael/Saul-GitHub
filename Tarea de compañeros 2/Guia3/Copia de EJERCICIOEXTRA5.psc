Algoritmo EJERCICIOEXTRA5
	
	//	Realizar una función que calcule la suma de los dígitos de un número.
	//Ejemplo: 25 = 2 + 5 = 7
	//Nota: Para obtener el último número de un digito de 2 cifras o más debemos pensar en el
	//resto de una división entre 10. Recordar el uso de la función Mod y Trunc.	
	
	Definir num Como Entero	
	Escribir "ingrese un numero de dos cifras"
	leer num
	Escribir "la suma entre los dos numeros que componen el N° ", num, " da como resultado " suma(num)
	
FinAlgoritmo

Funcion x <- suma(a1)
	Definir x,i,f como entero
	i = a1 mod 10
	f =  trunc(a1/10)
	x = i + f
Fin Funcion