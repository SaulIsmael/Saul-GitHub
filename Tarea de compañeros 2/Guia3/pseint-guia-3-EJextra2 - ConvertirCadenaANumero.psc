//Dise�ar una funci�n que reciba un numero en forma de cadena y lo devuelva como numero entero. El programa 
//podr� recibir n�meros de hasta 3 d�gitos. Nota: no poner n�meros con decimales 

Algoritmo Funciones_ejxtra2
	Definir n Como Caracter
	Escribir "Ingrese un numero entero de hasta tres cifras"
	Leer n
	Mientras Longitud(n) >= 4 Hacer
		Escribir "Solo ingrese numeros de hasta TRES cifras"
		Leer n 
	FinMientras
	Escribir "El numero ingresado es: ", cadenaNumero(n) 
	Escribir "Ahora puede, por ejemplo, sumar ", n, " + 5, y obtener el resultado numerico: ", cadenaNumero(n) + 5
	
	
FinAlgoritmo

Funcion num1 = cadenaNumero(n)
	Definir num1 Como Entero
	num1 = ConvertirANumero(n)
	
FinFuncion
	