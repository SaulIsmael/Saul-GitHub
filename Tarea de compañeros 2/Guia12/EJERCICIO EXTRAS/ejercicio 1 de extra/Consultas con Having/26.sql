select id_depto, COUNT(id_depto) from empleado GROUP BY id_depto HAVING COUNT(id_depto)= 0 ;