Algoritmo EJERCICIOEXTRA6
	
	//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número
	//tiene todos sus dígitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el
	//numero en partes (si es un numero de más de un digito) y ver si cada número es par o impar.
	//Nota: recordar el uso de la función Mod y Trunc(). No podemos pasar el numero a cadena para
	//realizar el ejercicio.
	
	Definir num Como Entero
	Definir resultado Como Logico
	Escribir "ingrese un numero "
	leer num
	resultado = impares(num)
	Si resultado = Verdadero Entonces
		Escribir "el numero ", num, " no tiene todos sus digitos impar/res"
	SiNo
		Escribir "el numero ", num, " tiene todos sus digitos impar/res"
	Fin Si
	
FinAlgoritmo

Funcion x <- impares(a1)
	Definir i,f como entero
	Definir x como logico
	Si  a1 > 9 Entonces
		i = a1 mod 10
		f =  trunc(a1/10)
		Si f mod 2 = 0 o i mod 2 = 0 Entonces
			x = Verdadero
		SiNo
			x = falso
				
		Fin Si
		
	SiNo
		i = a1 mod 2
		Si i = 0 Entonces
			x = Verdadero
		SiNo
			x = falso
		Fin Si
		
	Fin Si
	
Fin Funcion
	

