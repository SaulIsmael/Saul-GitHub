-- 1. Lista el nombre de todos los productos que hay en la tabla producto.
SELECT nombre
FROM producto;
-- 2. Lista los nombres y los precios de todos los productos de la tabla producto.
select nombre, precio
from producto;
-- 3. Lista todas las columnas de la tabla producto.
select * 
from producto;
-- 4. Lista los nombres y los precios de todos los productos de la tabla producto, redondeando
-- el valor del precio.
select nombre, round(precio)
from producto;
-- 5. Lista el código de los fabricantes que tienen productos en la tabla producto.
select codigo_fabricante from fabricante 
inner join producto on fabricante.codigo = producto.codigo_fabricante;
-- 6. Lista el código de los fabricantes que tienen productos en la tabla producto, sin mostrar
-- los repetidos.
select distinct f.codigo from fabricante f , producto p
where f.codigo = p.codigo_fabricante;
-- 7. Lista los nombres de los fabricantes ordenados de forma ascendente.
select nombre
from fabricante
order by nombre;
-- 8. Lista los nombres de los productos ordenados en primer lugar por el nombre de forma
-- ascendente y en segundo lugar por el precio de forma descendente.
select nombre, precio 
from producto
order by nombre asc, precio desc;
-- 9. Devuelve una lista con las 5 primeras filas de la tabla fabricante.
select * 
from fabricante
limit 5;
-- 10. Lista el nombre y el precio del producto más barato. (Utilice solamente las cláusulas
-- ORDER BY y LIMIT)
select nombre,precio
from producto
order by precio asc
limit 1;
-- 11. Lista el nombre y el precio del producto más caro. (Utilice solamente las cláusulas ORDER
-- BY y LIMIT)
select nombre,precio
from producto
order by precio desc
limit 1;
-- 12. Lista el nombre de los productos que tienen un precio menor o igual a $120.
select nombre,precio
from producto
where precio <= 120;
-- 13. Lista todos los productos que tengan un precio entre $60 y $200. Utilizando el operador
-- BETWEEN.
select nombre,precio
from producto
where precio between 60 and 200;
-- 14. Lista todos los productos donde el código de fabricante sea 1, 3 o 5. Utilizando el operador
-- IN.
select nombre, codigo_fabricante
from producto
where codigo_fabricante in (1,3,5);
-- 15. Devuelve una lista con el nombre de todos los productos que contienen la cadena Portátil
-- en el nombre.
select nombre
from producto
where nombre like '%portatil%';
-- Consultas Multitabla
-- 1. Devuelve una lista con el código del producto, nombre del producto, código del fabricante
-- y nombre del fabricante, de todos los productos de la base de datos.
select p.codigo , p.nombre , f.codigo, f.nombre 
from fabricante f, producto p
where f.codigo = p.codigo_fabricante;
-- 2. Devuelve una lista con el nombre del producto, precio y nombre de fabricante de todos
-- los productos de la base de datos. Ordene el resultado por el nombre del fabricante, por
-- orden alfabético.
select p.codigo , p.nombre , f.codigo, f.nombre 
from fabricante f, producto p
where f.codigo = p.codigo_fabricante
order by f.nombre;
-- 3. Devuelve el nombre del producto, su precio y el nombre de su fabricante, del producto
-- más barato.
select p.nombre, min(p.precio), f.nombre 
from fabricante f, producto p
where f.codigo = p.codigo_fabricante;
-- 4. Devuelve una lista de todos los productos del fabricante Lenovo.
select p.nombre, f.nombre, p.codigo_fabricante 
from fabricante f, producto p
where f.nombre = 'lenovo' and f.codigo = p.codigo_fabricante;
-- 5. Devuelve una lista de todos los productos del fabricante Crucial que tengan un precio
-- mayor que $200.
select p.nombre, f.nombre, p.codigo_fabricante 
from fabricante f, producto p
where f.nombre = 'Crucial' and f.codigo = p.codigo_fabricante
and p.precio >200; 
-- 6. Devuelve un listado con todos los productos de los fabricantes Asus, Hewlett-Packard.
-- Utilizando el operador IN.
select * 
from producto
left join fabricante on producto.codigo_fabricante = fabricante.codigo 
where fabricante.nombre in ('asus','hewlett-packard');
-- 7. Devuelve un listado con el nombre de producto, precio y nombre de fabricante, de todos
-- los productos que tengan un precio mayor o igual a $180. Ordene el resultado en primer
-- lugar por el precio (en orden descendente) y en segundo lugar por el nombre (en orden
-- ascendente)








