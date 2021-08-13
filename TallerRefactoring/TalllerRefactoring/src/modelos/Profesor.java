package modelos;



public class Profesor extends Persona{
   
    public InformacionAdicionalProfesor info;

    public Profesor() {
        super();
    }
    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }
    
    public InformacionAdicionalProfesor getInfo() {
        return info;
    }    
}
