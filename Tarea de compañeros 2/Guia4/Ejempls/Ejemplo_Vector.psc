Algoritmo Ejemplo_Vector
	///llena y mostrar un vector de numero que se ponga el usario 
	
	
	Definir vector , nu,i Como Entero
	 Dimension vector(5) ///definir el tamaño del vectoren 5
	
	///Usamos un para , para  pasar por todas las  posiciones del vector
	///Si nuestro vector es de tamaño 5 y empieza en 0, sus posiciones son 0-4
	 Para i<-0 hasta 4 con paso 1 hacer 
		///pedimos los numeros en la Para 
		/// de esa manera pedimos  la cantidad  exacta de numeros 
		escribir "ingrese un numero para el subindice" i
		Leer num
		
		/// asignamos num a la posicion  actual  del vector.
		/// que depende  de cual sea el valor de i
		Vector(i)=num
		      
	FinPara
	///usamos otra para  , para mostrar los elementos del vector 
	Para I<- 0 hasta 4 con paso 1 Hacer
		Escribir Sin Saltar"[" vector(i) "]"
	FinPara
	
	
FinAlgoritmo