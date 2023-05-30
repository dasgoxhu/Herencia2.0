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
public class Empleado extends Persona {
    private int Tiempo;
    private String Despacho;

    public Empleado(){}

    public Empleado(int Tiempo, String Despacho, String Nombre, String Apellido, String ID, String Estado)
    {
        super(Nombre, Apellido, ID, Estado);
        this.Tiempo = Tiempo;
        this.Despacho = Despacho;
    }

    public Empleado(int Tiempo, String Despacho) 
    {
        this.Tiempo = Tiempo;
        this.Despacho = Despacho;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public String getDespacho() {
        return Despacho;
    }

    public void setTiempo(int Tiempo) {
        this.Tiempo = Tiempo;
    }

    public void cambioDespacho(String Despacho) {
        this.Despacho = Despacho;
    }
    @Override
       public String MostrarInf()
    {
       String Aux;
       Aux = "Nombre: " + getNombre() + " Apellidos: " + getApellido() + " Documento de identificacion: " + getID() + " Estado Civil: " + getEstado() + " El dia de entrada : " +  Tiempo + " Despacho asignado es: " + Despacho;
       return Aux;
    }
}
