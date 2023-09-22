select id_depto, avg(salario) from empleado group by id_depto;
select id_depto, ROUND(avg(salario)) from empleado group by id_depto;