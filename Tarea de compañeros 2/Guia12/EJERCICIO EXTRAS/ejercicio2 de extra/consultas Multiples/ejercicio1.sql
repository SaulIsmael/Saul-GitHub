SELECT * FROM producto RIGHT JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo;
SELECT * FROM fabricante LEFT JOIN producto ON fabricante.codigo = producto.codigo_fabricante;