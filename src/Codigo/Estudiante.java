
package Codigo;


public class Estudiante extends Persona {
    private String Curso;

    public Estudiante(String Curso, String Nombre, String Apellido, String ID, String Estado) {
        super(Nombre, Apellido, ID, Estado);
        this.Curso = Curso;
    }

    public String getCurso() {
        return Curso;
    }

    public void CabioCurso (String Curso){
        this.Curso = Curso;
    }
    
    @Override
       public String MostrarInf()
    {
       String Aux;
       Aux = "Nombre: " + getNombre() + " Apellidos: " + getApellido() + " Documento de identificacion: " + getID() + " Estado Civil: " + getEstado() + " Curso: " +  Curso; ;
       return Aux;
    }
}
