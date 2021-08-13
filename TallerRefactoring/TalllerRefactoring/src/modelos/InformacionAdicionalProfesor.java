package modelos;

public class InformacionAdicionalProfesor {
    public int añosdeTrabajo;
    public String facultad;
    public double BonoFijo;
    
    public int getAñosTrabajo() {
        return añosdeTrabajo;
    }

    public double getBonoFijo() {
        return BonoFijo;
    }

    public double calcularSueldo(Profesor prof){
        return prof.getInfo().getBonoFijo()*600 + prof.getInfo().getBonoFijo();
        
    } 
}
