package modelos;

public class Notas {
    public double notaInicial;
    public double notaFinal;

    public Notas(double notaInicial, double notaFinal){
        this.notaInicial = notaInicial;
        this.notaFinal = notaFinal;
    }

    //Calcula y devuelve la nota inicial o final contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    public static double CalcularNota(double nexamen, double ndeberes, double nlecciones, double ntalleres){
        return ((nexamen + ndeberes + nlecciones) * 0.80) + (ntalleres * 0.20);
    }
    
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. Esta nota es solo el promedio de las dos calificaciones anteriores.
    public double CalcularNotaTotal(){
        return (this.notaInicial + this.notaFinal)/2;
    }
}
