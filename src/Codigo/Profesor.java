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
public class Profesor extends Empleado {
    private String departamento;

    public Profesor(String departamento, int Tiempo, String Despacho, String Nombre, String Apellido, String ID, String Estado) {
        super(Tiempo, Despacho, Nombre, Apellido, ID, Estado);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void cambioDerpatamento(String departamento) {
        this.departamento = departamento;
    }
    
    @Override
    public String MostrarInf()
    {
       String Aux;
       Aux = "Nombre: " + getNombre() + " Apellidos: " + getApellido() + " Documento de identificacion: " + getID() + " Estado Civil: " + getEstado() + " El dia de entrada : " +  getTiempo() + " Despacho asignado es: " + getDespacho() + " Derpatamento: " + departamento;
       return Aux;
    }
    
}
