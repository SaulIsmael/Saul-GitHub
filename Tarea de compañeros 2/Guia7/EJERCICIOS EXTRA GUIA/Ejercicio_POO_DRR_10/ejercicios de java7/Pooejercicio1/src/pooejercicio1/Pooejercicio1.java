
package pooejercicio1;

import pooejercicio1.entidad.Persona;
import pooejercicio1.servicio.PersonaServicio;

public class Pooejercicio1 {
      public static void main(String[] args) {
     PersonaServicio p2=new PersonaServicio();
     Persona p1=p2.crearpersona();
        System.out.println(p1);
}

    
  
}
