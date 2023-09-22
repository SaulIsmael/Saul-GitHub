
// Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es
// capicúa o no (Por ejemplo: 12321). Nota: recordar el uso del MOD y el Trunc. No podemos
// transformar el numero a cadena para realizar el ejercicio.

Algoritmo Guia3Ej8Extra
	
	Definir num Como Entero
	Escribir "Ingresar un número para conocer si es capicua:"
	Leer num
	
	Escribir "¿Es capicua? ", Capicua(num)
	
FinAlgoritmo

Funcion esCapicua <- Capicua(num)
	
	Definir esCapicua Como Logico
	Definir largoNum, numTrunc, i, j, k, modulo, primero, ultimo, iteraciones Como Entero
	
	
	largoNum = 0
	esCapicua = Falso
	modulo = 1
	
	hacer
		
		numTrunc = num
		
		Hacer
			
			numTrunc = trunc(numTrunc/10)
			
			largoNum = largoNum + 1
			
		Mientras Que numTrunc <> 0
		
		si largoNum mod 2 <> 0 Entonces
			iteraciones = (largoNum - 1) / 2
		SiNo
			iteraciones = largoNum / 2
		FinSi
		
		para k = 1 Hasta largoNum -1 
			
			modulo = modulo * 10
			
		FinPara
		
		primero = num mod 10
		
		ultimo = trunc(num/modulo)
		
		Escribir primero, ultimo
		
		num = num mod modulo
		
		num = trunc(num/10)
		
		Escribir num
		
	Mientras Que iteraciones > 1
	
	
//	Escribir largoNum
//	nuevoUltimo = largoNum
//	modulo = 1
//	
//	para i = 1 Hasta largoNum Hacer
//		
//		
//		si i < nuevoUltimo Entonces
//			
//			para k = 1 Hasta nuevoUltimo
//				
//				modulo = modulo * 10
//				
//			FinPara
//			
//			para j = i hasta nuevoUltimo Hacer
//				
//				
//				
//			FinPara
//			
//		FinSi
//		
//		nuevoUltimo = nuevoUltimo - 1
//		
//		modulo = 1
//	FinPara
	
FinFuncion
