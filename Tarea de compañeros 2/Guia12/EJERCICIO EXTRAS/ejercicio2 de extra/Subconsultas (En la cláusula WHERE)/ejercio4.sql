SELECT * FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = 'Asus' ) AND precio > (SELECT AVG(precio) from producto);