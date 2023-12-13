package ejercicio1;

public class Examen {
    private String titulo;
    private double calificacion;
    private String asignatura;





    public Examen(String titulo, double calificacion, String asignatura) throws Exception{
        if (titulo == null){
            throw new Exception("el titulo no puede estar vacio");
        } else{
            this.titulo = titulo;
        }
        if (calificacion < 0 || calificacion > 10){
            throw new Exception("la calificacion no puede salir de 0 a 10");
        } else {
            this.calificacion = calificacion;
        }
        this.asignatura = asignatura;

    }

    public String getTitulo() {
        return titulo;
    }


    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) throws Exception{
        if (calificacion < 0 || calificacion > 10){
            throw new Exception("la calificacion no puede salir de 0 a 10");
        } else {
            this.calificacion = calificacion;
        }
    }

    @Override
    public String toString() {
        return asignatura + " - " + titulo + " - " + calificacion;
    }

    public void redondear(double calificacion){

        this.calificacion = (int) Math.round(calificacion);

    }

    public boolean estaAprobado(double calificacion){
        if (calificacion >= 5){
            return true;
        } else {
            return false;
        }
    }



    public String getAsignatura() {
        return asignatura;
    }


}
