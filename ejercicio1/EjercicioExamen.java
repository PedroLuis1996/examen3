package ejercicio1;

public class EjercicioExamen {
    public static void main(String[] args) throws Exception {
        Examen examen = new Examen("Tema 3", 3.34, "Programacion");


        System.out.println(examen);
        examen.setCalificacion(9.45);
        System.out.println(examen);
        examen.redondear(examen.getCalificacion());
        System.out.println(examen.estaAprobado(examen.getCalificacion()));
        System.out.println(examen);



    }


}
