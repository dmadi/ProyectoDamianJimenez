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
import java.io.*;
import java.io.File;
import java.util.ArrayList;
public class GuardaDatos {
     public synchronized static ArrayList<Dato> leer()throws Exception{
   File file=new File("datos.xxxx"); 
   
   FileInputStream arc=new FileInputStream(file);
    ObjectInputStream  ois=new ObjectInputStream(arc);
  ArrayList<Dato> u=(ArrayList<Dato>)  ois.readObject();
  ois.close();
  return u;
}
     
     public static void guardar(Dato d)throws Exception{
        ArrayList datos=new ArrayList<Dato>();
        
       File file=new File("datos.xxxx");    
         if(file.exists()){
           datos=  leer();
         }
    FileOutputStream arc=new FileOutputStream(file);
    ObjectOutputStream  ois=new ObjectOutputStream(arc);
    datos.add(d);
     ois.writeObject(datos); 
    ois.close();
  System.out.println("Registrado!!");
    }
    
}
     
     
