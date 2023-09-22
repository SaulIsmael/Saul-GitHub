//Los empleados de una fábrica trabajan en dos turnos: Diurno y Nocturno. Se desea calcular el jornal diario 
//de acuerdo con las siguientes reglas: 
//a) La tarifa de las horas diurnas es de $ 90 
//b) La tarifa de las horas nocturnas es de $ 125 
//c) En caso de ser feriado, la tarifa se incrementa en un 10% si el turno es diurno y en un 15% si el turno es nocturno. 
//El programa debe solicitar la siguiente información al usuario: el nombre del trabajador, el día de la 
//semana, el turno (diurno o nocturno) y la cantidad de horas trabajadas. Además, debemos preguntarle al 
//usuario si el día de la semana (lunes, martes, miércoles, etc.) era festivo o no, para poder calcular el 
//jornal diario. Utilice una función para realizar el cálculo. 

Algoritmo Funciones_EJextra_4
	Definir nombreTdor, diaF Como Caracter
	Definir dia, turno, horas Como Entero
	Escribir "--- JORNAL DIARIO ---"
	Escribir "---------------------"
	Escribir "Para calcular el jornal diario ingrese los siguientes datos:"
	Escribir "Nombre del trabajador"
	Leer nombreTdor
	Hacer
		Escribir "Seleccione dia de la semana a calcular (1-6)"
		Escribir "(1) lunes"
		Escribir "(2) martes"
		Escribir "(3) miercoles"
		Escribir "(4) jueves"
		Escribir "(5) viernes"
		Escribir "(6) sabado"
		Leer dia
		Limpiar Pantalla
	Mientras Que dia < 1 o dia > 6
	Escribir "Indique si es dia festivo. S/N"
	Leer diaF
	Hacer
		Escribir "Seleccione turno de trabajo (1/2)"
		Escribir "(1) Diurno"
		Escribir "(2) Nocturno"
		Leer turno
		Limpiar Pantalla
	Mientras Que turno < 1 o turno > 2
	Escribir "Ingrese cantidad de horas trabajadas"
	Leer horas
	Esperar 1.5 Segundos
	Escribir "El Jornal diario de ", nombreTdor, ", es de: ", calcularJornal(diaF, turno, horas), " pesos."
		
FinAlgoritmo

Funcion jornalDiario = calcularJornal(diaF, turno, horas)
	Definir jornalDiario Como Real
	Si turno == 1 Entonces
		Si Mayusculas(diaF) == "S" Entonces
			jornalDiario = horas * 90 + ((horas * 90) * 0.1) 
		SiNo
			jornalDiario = horas * 90
		FinSi
	SiNo
		Si Mayusculas(diaF) == "S" Entonces
			jornalDiario = horas * 125 + ((horas * 125) * 0.15)
		SiNo
			jornalDiario = horas * 125
		FinSi
	FinSi
	
FinFuncion
	