Algoritmo EJERCICIOEXTRA5
	
	//	Realizar una funci�n que calcule la suma de los d�gitos de un n�mero.
	//Ejemplo: 25 = 2 + 5 = 7
	//Nota: Para obtener el �ltimo n�mero de un digito de 2 cifras o m�s debemos pensar en el
	//resto de una divisi�n entre 10. Recordar el uso de la funci�n Mod y Trunc.	
	
	Definir num Como Entero	
	Escribir "ingrese un numero de dos cifras"
	leer num
	Escribir "la suma entre los dos numeros que componen el N� ", num, " da como resultado " suma(num)
	
FinAlgoritmo

Funcion x <- suma(a1)
	Definir x,i,f como entero
	i = a1 mod 10
	f =  trunc(a1/10)
	x = i + f
Fin Funcion