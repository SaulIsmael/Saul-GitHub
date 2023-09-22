Algoritmo leo_e_invierno
	///dimension nombre_variable(tamaño)
	///Definir  nombre_variable entero
	
	Dimension valores(5)
	Definir i ,valores Como Entero
	
	Escribir "ingresa 5 valores enteros"
	
	Para i=0 Hasta 4 Hacer
		Leer  valores(i)
	FinPara

	Escribir "Los valores ingresados en forma invertida son" // 1,2,3,4,5 los valore en forma invertida son / 5,4,3,2,1
	
	Para i=4 Hasta 0 con paso -1 Hacer
		si i=0
			escribir valores(i)
			
		SiNo
			escribir valores(i) "," Sin Saltar
		FinSi
		
	FinPara
	
	
	
FinAlgoritmo
