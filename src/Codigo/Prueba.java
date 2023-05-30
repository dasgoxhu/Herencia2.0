/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

/**
 *
 * @author User
 */
public class Prueba {
    
     public static void main(String[] args)
     {
        Estudiante a = new Estudiante("Construccion", "Pedro", "logaliza", "32B", "Soltero");
        System.out.print(a.MostrarInf());
        Profesor b = new Profesor("Algebra", 10, "34C-2", "Alberto", "oza", "3a", "Casado" );
        System.out.print("\n" +b.MostrarInf());
     }
    
   
    
}
