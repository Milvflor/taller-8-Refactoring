package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante{
    public ArrayList<Paralelo> paralelosAyudantias;

    Ayudante(){
        super();
    }

    //Los paralelos se añaden/eliminan directamente del Arraylist de paralelosAyudantias

    //Método para imprimir los paralelos que tiene asignados como ayudante
    public void MostrarParalelos(){
        for(Paralelo par:paralelosAyudantias){
            //Muestra la info general de cada paralelo
        }
    }
}
