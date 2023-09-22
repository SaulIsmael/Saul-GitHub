Algoritmo vector_i
	Definir  vector,i,suma,n Como Entero
	Escribir "que cantidad va a tener el vector"
	leer n
	suma=0
	Dimension vector(n)
	Escribir"digita valores para el vector"
	para i<-0 Hasta  n-1 con paso 1 Hacer
		leer vector(i)
		suma=suma+vector(i)
	FinPara
	Escribir "la suma da", suma
FinAlgoritmo
