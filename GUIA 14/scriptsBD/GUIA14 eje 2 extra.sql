-- 1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
select *
from jugadores
order by nombre;
-- 2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras,
-- ordenados por nombre alfabéticamente.
select Nombre,Posicion,Peso
from jugadores
where posicion = 'c' and peso >= 200
order by nombre;
-- 3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.
select nombre
from equipos
order by nombre;
-- 4. Mostrar el nombre de los equipos del este (East).
select Nombre, Conferencia
from equipos
where Conferencia= 'East';
-- 5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
select Nombre, Ciudad
from equipos
where Ciudad like 'c%'
order by nombre;
-- 6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
select Nombre, nombre_equipo
from jugadores
order by Nombre_equipo;
-- 7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
select Nombre, nombre_equipo
from jugadores 
where nombre_equipo = 'raptors'
order by Nombre;
-- 8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.
select jugadores.nombre, estadisticas.jugador, estadisticas.Puntos_por_partido
from jugadores 
inner join estadisticas on jugadores.codigo = estadisticas.jugador
where jugadores.nombre = 'Pau Gasol';
-- 9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.





-- 10. Mostrar el número de puntos de cada jugador en toda su carrera.
-- 11. Mostrar el número de jugadores de cada equipo.
-- 12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
-- 13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
-- 14. Mostrar la media de puntos en partidos de los equipos de la división Pacific.
-- 15. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor
-- diferencia de puntos.
-- 16. Mostrar la media de puntos en partidos de los equipos de la división Pacific.
-- 17. Mostrar los puntos de cada equipo en los partidos, tanto de local como de visitante.
-- 18. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante,
-- equipo_ganador), en caso de empate sera null.