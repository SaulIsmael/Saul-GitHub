SELECT nombre, salario, comision, (salario+comision) AS salario_total FROM empleado WHERE comision <= salario*30/100;