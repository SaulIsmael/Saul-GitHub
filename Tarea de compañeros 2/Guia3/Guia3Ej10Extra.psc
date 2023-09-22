
// Crea un procedimiento "convertirEspaciado", que reciba como argumento un texto y muestra
// una cadena con un espacio adicional tras cada letra.
// Por ejemplo, "Hola, tú" devolverá "H o l a , t ú ". Crea un programa principal donde se use
// dicho procedimiento.


Algoritmo Guia3Ej10Extra
	
	Definir frase Como Caracter
	
	Escribir "Ingresá una frase:"
	Leer frase
	
	espaciado(frase)
	
FinAlgoritmo

SubProceso espaciado(frase Por valor)
	
	Definir nuevaFrase Como Caracter
	Definir i Como Entero
	nuevaFrase = ""
	
	Para i = 0 Hasta Longitud(frase) -1 Hacer
		
		nuevaFrase = Concatenar(nuevaFrase,Subcadena(frase,i,i))
		nuevaFrase = Concatenar(nuevaFrase," ")
		
	FinPara
	
	Escribir nuevaFrase
	
FinSubAlgoritmo
	