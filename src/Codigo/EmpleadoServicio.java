
package Codigo;


public class EmpleadoServicio extends Empleado {
    private String TrabajoSeccion;

    public String getTrabajoSeccion() {
        return TrabajoSeccion;
    }
    public void CambioSeccion(String TrabajoSeccion){
        this.TrabajoSeccion = TrabajoSeccion;
    }
    
    @Override
    public String MostrarInf()
    {
       String Aux;
       Aux = "Nombre: " + getNombre() + " Apellidos: " + getApellido() + " Documento de identificacion: " + getID() + " Estado Civil: " + getEstado() + " El dia de entrada : " +  getTiempo() + " Despacho asignado es: " + getDespacho() + "Seccion de trabajo: " + TrabajoSeccion;
       return Aux;
    }
    
}
