Algoritmo AreaConFuncion
	Definir rad,resultado Como Real
	Escribir "ingese un radio"
	Leer rad
	resultado= Areadelcirculo (rad)
	Escribir "El Area de un circulo con radio ", rad , " es " ,resultado
FinAlgoritmo
Funcion area <- Areadelcirculo(radio)
	Definir  area 	Como Real
	area= 3.14*radio*radio
FinFuncion
