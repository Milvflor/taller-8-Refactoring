package modelos;
import java.util.ArrayList;

public class Persona {
    //Informacion de la persona
    public String nombre;
    public String apellido;
    public String facultad;
    public int edad;
    public String direccion;
    public String telefono;
    public String codigo;
    public ArrayList<Paralelo> paralelos;
    
    

    public Persona(String nombre, String apellido, String facultad, int edad, String direccion, String telefono,
            String codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.facultad = facultad;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.codigo = codigo;
    }

    public Persona(){}

    public ArrayList<Paralelo> getParalelos() {
            return paralelos;
        }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
