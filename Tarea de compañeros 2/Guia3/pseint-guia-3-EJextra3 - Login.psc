//Crear una función llamada "Login", que recibe un nombre de usuario y una contraseña y que devuelve Verdadero 
//si el nombre de usuario es "usuario1" y si la contraseña es "asdasd". Además, la función calculara el número 
//de intentos que se ha usado para loguearse, tenemos solo 3 intentos, si nos quedamos sin intentos la función 
//devolverá Falso. 

Algoritmo Funciones_EJxtra_3
	Definir confirma Como Caracter
	Escribir "Desea loguearse? S/N"
	Leer confirma
	si Mayusculas(confirma) == "S" Entonces
		Escribir Login() 
	FinSi
	
	
FinAlgoritmo

Funcion Log_Ok = Login() 
	Definir Log_Ok Como Logico
	Definir usuario, clave Como Caracter
	Definir cont Como Entero
	cont = 1
	Hacer
		cont = cont + 1
		Escribir "Ingrese su nombre de usuario"
		Leer usuario
		Escribir "Ingrese su password"
		Leer clave
	Mientras Que cont < 4 y (usuario <> "usuario1" y clave <> "asdasd") 
	Log_Ok = (usuario = "usuario1" y clave = "asdasd")
	
FinFuncion
	