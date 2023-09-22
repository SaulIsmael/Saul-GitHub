/*A continuación, se deben realizar las siguientes consultas sobre la base de datos:*/

/*1. Mostrar el nombre de todos los pokemon.*/
select numero_pokedex, nombre
from pokemon 
order by numero_pokedex asc;

/*2. Mostrar los pokemon que pesen menos de 10k.*/
select numero_pokedex, nombre, peso 
from pokemon
where peso<=10
order by peso asc;

/*3. Mostrar los pokemon de tipo agua.*/
select tipo.id_tipo, pokemon_tipo.numero_pokedex, tipo.nombre 
from tipo
inner join pokemon_tipo on tipo.id_tipo=pokemon_tipo.id_tipo
where pokemon_tipo.id_tipo=1;

/*4. Mostrar los pokemon de tipo agua, fuego o tierra ordenados por tipo.*/
select tipo.id_tipo, pokemon_tipo.numero_pokedex, tipo.nombre 
from tipo
inner join pokemon_tipo
on tipo.id_tipo=pokemon_tipo.id_tipo
where pokemon_tipo.id_tipo=1 or pokemon_tipo.id_tipo=6 or pokemon_tipo.id_tipo=13 
order by tipo.nombre;

/*5. Mostrar los pokemon que son de tipo fuego y volador.*/
select tipo.id_tipo, pokemon_tipo.numero_pokedex, tipo.nombre 
from tipo
inner join pokemon_tipo
on tipo.id_tipo=pokemon_tipo.id_tipo
where pokemon_tipo.id_tipo=6 or pokemon_tipo.id_tipo=15 
order by tipo.nombre;

/*6. Mostrar los pokemon con una estadística base de ps mayor que 200.*/
select numero_pokedex, ps 
from estadisticas_base
where ps>=200;

/*7. Mostrar los datos (nombre, peso, altura) de la prevolución de Arbok.*/
select numero_pokedex, nombre, peso, altura
from pokemon
where nombre='Arbok';

/*8. Mostrar aquellos pokemon que evolucionan por intercambio.*/

/*9. Mostrar el nombre del movimiento con más prioridad.*/

/*10. Mostrar el pokemon más pesado.*/
select MAX(peso) as Peso_Maximo
from pokemon;

/*11. Mostrar el nombre y tipo del ataque con más potencia.*/
select movimiento.nombre , movimiento.potencia
from movimiento
join(
select MAX(potencia) as Maxima_potencia
from movimiento
)
m on movimiento.potencia=m.Maxima_potencia;

/*12. Mostrar el número de movimientos de cada tipo.*/


/*13. Mostrar todos los movimientos que puedan envenenar.*/
/*14. Mostrar todos los movimientos que causan daño, ordenados alfabéticamente por nombre.*/
/*15. Mostrar todos los movimientos que aprende pikachu.*/
/*16. Mostrar todos los movimientos que aprende pikachu por MT (tipo de aprendizaje).*/
/*17. Mostrar todos los movimientos de tipo normal que aprende pikachu por nivel.*/
/*18. Mostrar todos los movimientos de efecto secundario cuya probabilidad sea mayor al 30%.*/
/*19. Mostrar todos los pokemon que evolucionan por piedra.*/
/*20. Mostrar todos los pokemon que no pueden evolucionar.*/
/*21. Mostrar la cantidad de los pokemon de cada tipo.*/
