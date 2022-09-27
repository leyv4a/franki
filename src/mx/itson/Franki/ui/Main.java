    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.Franki.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.Franki.entidades.Ingrediente;
import mx.itson.Franki.entidades.Receta;
import mx.itson.Franki.enumeradores.Dificultad;

/**
 *
 * @author gabri
 */
public class Main {

   public static void Main(String[] args)  {
       
         Receta receta = new Receta();
         receta.setNombre("Franki Brownies");
         receta.setDescripcion("Hornea una receta de FRANKI BROWNIES");
         receta.setNumeroPorciones(6);
         receta.setDuracion(62);
         
         List<Ingrediente> ingredientes = new ArrayList<>();
         
         Ingrediente ingrediente1= new Ingrediente ();
         ingrediente1.setNombre("1 Caja de Harina para brownies chocolate Fudge de Betty Crocker® (519 g)");
         Ingrediente ingrediente2=new Ingrediente();
         ingrediente2.setNombre("3 Cucharadas de Agua");
         
         ingredientes.add(ingrediente1);
         ingredientes.add(ingrediente2);
         
         receta.setIngredientes(ingredientes);
         
         
         receta.setDificultad(Dificultad.INTERMEDIO);

   }
   
  
   
   
   
    
   
    
}
