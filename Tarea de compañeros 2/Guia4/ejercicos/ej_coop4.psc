SubProceso inicializarMatriz(matriz Por Referencia, dim_filas, dim_colum)
	Definir i,j Como Entero
	Para i = 0 Hasta dim_filas - 1 Hacer
		Para j = 0 Hasta dim_colum - 1 Hacer
			matriz[i,j] = "*"
		FinPara
	FinPara
FinSubProceso

SubProceso imprimirMatriz(matriz Por Referencia, dim_filas, dim_colum)
	Definir i,j Como Entero
	Para i = 0 Hasta dim_filas - 1 Hacer
		Para j = 0 Hasta dim_colum - 1 Hacer
			Escribir Sin Saltar matriz[i,j]," "
		FinPara
		Escribir ""
	FinPara
FinSubProceso

SubProceso agregarPalabra(matriz Por Referencia, fila, palabra)
	Definir j Como Entero
	Para j = 0 Hasta Longitud(palabra) - 1 Hacer
		matriz[fila - 1,j] = Subcadena(palabra,j,j)
	FinPara
FinSubProceso

Funcion pos <- buscarR(matriz Por Referencia, fila)
	Definir pos,j Como Entero
	pos = -1
	j = 0
	Repetir
		Si matriz[fila,j] = "R" Entonces
			pos = j
		FinSi
		j = j + 1
	Hasta que pos <> -1 | j = 12
FinSubProceso

SubProceso acomodarPalabras(matriz Por Referencia)
	Definir movs,j,i,n_desp Como Entero
	Definir ant,act Como Caracter
	Para i = 0 Hasta 8 Hacer
		n_desp = abs((5 + 1) - (BuscarR(matriz, i) + 1))
		Si n_desp <> 0 Entonces
			Para movs = 1 Hasta n_desp Hacer
				ant = "*"
				Para j = 0 Hasta 11 Hacer
					act = matriz[i, j]
					matriz[i, j] = ant
					ant = act
				FinPara
			FinPara
		FinSi
	FinPara
FinSubProceso

Algoritmo ej_coop4
	
	Definir tablero Como Cadena
	
	Dimension tablero[9,12]
	
	inicializarMatriz(tablero,9,12)
	
	agregarPalabra(tablero,1,"VECTOR")
	agregarPalabra(tablero,2,"MATRIX")
	agregarPalabra(tablero,3,"PROGRAMA")
	agregarPalabra(tablero,4,"SUBPROGRAMA")
	agregarPalabra(tablero,5,"SUBPROCESO")
	agregarPalabra(tablero,6,"VARIABLE")
	agregarPalabra(tablero,7,"ENTERO")
	agregarPalabra(tablero,8,"PARA")
	agregarPalabra(tablero,9,"MIENTRAS")
	
	acomodarPalabras(tablero)
	
	imprimirMatriz(tablero,9,12)
	
	
FinAlgoritmo
