Algoritmo sin_titulo
	///Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios y los muestre por pantalla.
	Definir vector1,vector2, tam,tam2 Como Entero
	Dimension vector1(5)
	Dimension vector2(5)
	tam=5
	rellenarVector(vector1,vector2,tam)
	
	
FinAlgoritmo

SubProceso rellenarVector(vector1,vector2,tam)
	Definir f Como Entero
	Escribir "VALORES DEL VECTOR 1"
	para f=0 hasta tam-1 Hacer
		vector1(f)=Aleatorio(1,100)
		vector2(f)=Aleatorio(1,100)
		
		Escribir Sin Saltar vector1(f) " "
		
	FinPara
	Escribir ""
	Escribir "VALORES DEL VECTOR 2"
	para f=0 hasta tam-1 Hacer
		
		Escribir Sin Saltar vector2(f) " "
		
	FinPara
FinSubProceso