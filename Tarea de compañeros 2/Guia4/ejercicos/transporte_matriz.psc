Algoritmo transporte_matriz
	Definir  m,n,i,j Como Entero
	Escribir "ingrese la cardinalidad de M y N de la  matriz orinal"
	leer M,N
	
	///Dimension nombre_variable(cardinalidad_dim_1,cardinalidad_dim_2,...,cardinalidad_dim_N)
	///Definir nombre_variable tipo
	
	Dimension original(M,N), tranpuesto(N,M)
	Definir original, tranpuesto Como Real
	
	Para i=0 hasta M-1
		para j=0 hasta N-1
			Escribir"Ingrese el valor del elemento [",i,",",j "]" Sin Saltar
			Leer original(i,j)
		FinPara
	FinPara
FinAlgoritmo

imprimeMatriz(original, M , N)

Para i=0 hasta M-1
	para j=0 hasta N-1
		tranpuesto(j,i) =original(j,i)
	FinPara
FinPara

Imprimir "tamaño",(M*N), "Matriz tranpuesto"
imprimeMatriz(original, M , N)
