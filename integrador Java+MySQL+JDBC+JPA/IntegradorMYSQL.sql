/*Posición: El candado A está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
Teniendo el máximo de asistencias por partido, muestre cuantas veces se logró dicho máximo.
Este resultado nos dará la posición del candado (1, 2, 3 o 4)*/

SELECT  max(Asistencias_por_partido) FROM nba.estadisticas;

select count(*) from nba.estadisticas where Asistencias_por_partido = 34;
/* El Candado A esta en la Posición 2 */

select count(*) from nba.estadisticas where Asistencias_por_partido 
= (SELECT  max(Asistencias_por_partido) FROM nba.estadisticas);

/*Clave: La clave del candado A estará con formada por la/s siguientes consulta/s a la base de
datos:
Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea
centro o esté comprendida en otras posiciones.*/


select sum(j.peso), count(*) from nba.jugadores as j inner join	nba.equipos as e on e.nombre = j.Nombre_equipo
where conferencia like 'East' and posicion like '%C%';
/* El Candado A Clave 14043 */

select sum(j.peso), count(*) from nba.jugadores as j inner join	nba.equipos as e on e.nombre = j.Nombre_equipo
where conferencia like 'East' and posicion like '%C%' or posicion not like  '%C%';
/* El Candado A 80983 */

/*
CANDADO B
Posición: El candado B está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero de
jugadores que tiene el equipo Heat.
Este resultado nos dará la posición del candado (1, 2, 3 o 4) */

select count(*) from jugadores where Nombre_equipo = 'Heat';

select count(*) from jugadores where codigo in (select jugador from estadisticas 
where Asistencias_por_partido > (select count(*) from jugadores where Nombre_equipo = 'Heat'));
/*  El Candado B posición 3 */


/* Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de
datos:
La clave será igual al conteo de partidos jugados durante las temporadas del año 1999.*/

SELECT count(*) FROM nba.partidos where temporada like '%99%';
/* El Candado B clave 3480 */

/* CANDADO C
Posición: El candado C está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
La posición del código será igual a la cantidad de jugadores que proceden de Michigan y forman
parte de equipos de la conferencia oeste.
Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual a
195, y a eso le vamos a sumar 0.9945.
Este resultado nos dará la posición del candado (1, 2, 3 o 4)*/

select count(*) from jugadores where procedencia like '%Michigan%' and Nombre_equipo in
(select nombre from equipos where Conferencia = 'West');

select floor(4/count(*) + 0.9945) from jugadores where peso >= 195;
/*  El Candado C 1 */

/*Opcion Completa */

select floor(4/count(*) + 0.9945) from jugadores where peso >= 
(select count(*) from jugadores where procedencia like '%Michigan%' and 
Nombre_equipo in (select nombre from equipos where Conferencia = 'West'));

/*
Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de
datos:
Para obtener el siguiente código deberás redondear hacia abajo el resultado que se devuelve de
sumar: el promedio de puntos por partido, el conteo de asistencias por partido, y la suma de
tapones por partido. Además, este resultado debe ser, donde la división sea central.
*/

select * from equipos where Division like 'Central';

select floor(avg(Puntos_por_partido)+ count(Asistencias_por_partido) + sum(Tapones_por_partido)) from estadisticas where jugador in (select codigo from jugadores
where Nombre_equipo in (select nombre from equipos where Division like 'Central'));
/*  El Candado C con count clave = 631 */

use nba;
select floor(avg(Puntos_por_partido)+ sum(Asistencias_por_partido) + sum(Tapones_por_partido))
from estadisticas e inner join jugadores j on e.jugador = j.codigo
inner join equipos eq on j.Nombre_equipo = eq.Nombre where eq.Division = 'Central';
/* El Candado C con sum clave = 1038 */

/* CANDADO D
Posición: El candado D está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01. Este
resultado debe ser redondeado. Nota: el resultado debe estar redondeado. 
Este resultado nos dará la posición del candado (1, 2, 3 o 4)*/
SELECT ROUND(AVG(Tapones_por_partido)) AS RESULTADO_REDONDEADO, temporada, Nombre FROM estadisticas E INNER JOIN jugadores J
ON E.jugador = J.codigo WHERE J.Nombre = 'Corey Maggette' AND  E.temporada = '00/01';
/*  El Candado D POSICION 4 */

/* Clave: La clave del candado D estará con formada por la/s siguientes consulta/s a la base de
datos:  
Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por partido
de todos los jugadores de procedencia argentina. */

SELECT SUM(FLOOR(E.Puntos_por_partido)) AS SUMA_REDONDEADA_PARA_ABAJO FROM estadisticas E INNER JOIN  jugadores J 
ON E.jugador = J.codigo WHERE J.Procedencia = 'Argentina';
/* El Candado D clave = 183 */
