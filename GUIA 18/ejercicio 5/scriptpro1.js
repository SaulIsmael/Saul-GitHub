function operacion() {
    let num1 = parseInt(document.getElementById("num1").value);
    let num2 = parseInt(document.getElementById("num2").value);
    let opc = document.getElementById("letra").value.toLowerCase();
  
    function suma() {
      return num1 + num2;
    }
  
    function resta() {
      return num1 - num2;
    }
  
    function multiplicacion() {
      return num1 * num2;
    }
  
    function division() {
      return num1 / num2;
    }
  
    let resultado;
    switch (opc) {
      case "s":
        resultado = suma();
        break;
      case "r":
        resultado = resta();
        break;
      case "m":
        resultado = multiplicacion();
        break;
      case "d":
        resultado = division();
        break;
      default:
        resultado = "Operación no válida";
    }
  
    const resultadoElement = document.getElementById("resultado");
    resultadoElement.textContent = "El resultado es: " + resultado;
  }
  