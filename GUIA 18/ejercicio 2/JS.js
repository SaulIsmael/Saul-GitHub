const pi = 3.1415;

var radio = prompt("Ingrese el radio de la circunferencia");

var area = pi * Math.round(Math.pow(radio, 2));

var perimetro = 2 * pi * radio;

var template = 
`El area de es: ${area}
El perimetro es: ${perimetro}`;

alert(template);