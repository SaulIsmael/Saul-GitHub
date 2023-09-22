Proceso lostornillos
	definir tor, torder Como Entero
	Escribir "Ingresar tornillos fabricados: "
	leer tor
	escribir "ingresar tornillos Defectuosos: "
	leer torder
	si torder < 200 y no tor > 10000 Entonces
		Escribir "GRADO 6"
	FinSi
	si tor > 10000 y no torder < 200  Entonces
		Escribir "GRADO 7"
		
	FinSi
	si torder < 200 y tor > 10000 Entonces
		escribir "GRADO 8"
	SiNo
		si tor <= 10000 y torder >= 200 Entonces
			Escribir "GRADO 5"
		FinSi
		
	FinSi
FinProceso
