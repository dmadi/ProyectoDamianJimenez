/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProyectoFinal;

/**
 *
 * @author Damian
 */
public class Prueba {
     public static void main(String[] args) throws Exception {
        Dato d = new Dato(1,"¿Quien descubrio america?","Cristobal Colon","Sanson","Piojo Herrera");
      GuardaDatos.guardar(d);

        for (Dato dat : GuardaDatos.leer()) {
            System.out.println(dat);
        }
    }
    
}
