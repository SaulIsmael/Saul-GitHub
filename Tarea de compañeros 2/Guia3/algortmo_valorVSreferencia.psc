Algoritmo valorVSreferencia
	Definir num Como Entero
	num = 2
	Escribir num
	Escribir "Ahora enviamos el n�mero a la funci�n por valor y el resultado es:", val(num)
	Escribir num
	Escribir "***********"
	Escribir "Ahora enviamos el n�mero a la funci�n por referencia y el resultado es:", val2(num)
	Escribir num
FinAlgoritmo

SubProceso elevarAlCuadradoPorValor <- val (num Por Valor)
	num = num * num
FinSubProceso
SubProceso elevarAlCuadradoPorReferencia <- val2 (num Por Referencia)
	num = num * num
FinSubProceso

