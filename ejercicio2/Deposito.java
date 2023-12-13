package ejercicio2;

public class Deposito {
    private int capacidad;
    private Contenido contenido;
    private int litros;

    public int getLitros() {
        return litros;
    }

    public int getCapacidad() {
        return capacidad;

    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Contenido getContenido() {
        return contenido;
    }


    public Deposito(int capacidad, Contenido contenido) {
        this.capacidad = capacidad;
        this.contenido = contenido;
        this.litros = 0;
    }

    public Deposito(int capacidad) {
        this.capacidad = capacidad;
        this.litros = 0;
    }

    @Override
    public String toString() {
        if (contenido == null ){
            return "Deposito (" + litros + "/" + capacidad + " l.)";
        }
        return "Deposito de " + contenido + " (" + litros + "/" + capacidad + " l.)";
    }

    public boolean estaVacio(){
        if (litros == 0){
            return true;
        }
        return false;
    }

    public int llenar(int litros, Contenido contenido)throws Exception{
        if (contenido != this.contenido){
            throw new Exception("el contenido no coincide, esta lleno de " + this.contenido);
        }
        this.litros = litros + this.litros;
        if (this.litros > capacidad){
            this.litros = capacidad;
        }
        return this.litros;
    }

    public int extraer(int litros)throws Exception{
        if (this.litros < litros){
            throw new Exception("no puedes sacar mas litros de los que hay");
        }
        this.litros = this.litros - litros;
        return this.litros;
    }

    public double getPorcentaje(){
        int porcentaje;
        if (this.litros == this.capacidad){
           return 100;
        }else if (this.litros == 0){
            return 0;
        }else {
            porcentaje = (this.litros * this.capacidad) / 100;
            return porcentaje;
        }
    }

    public void tansvasar(Deposito deposito) throws Exception {
        this.litros = deposito.getLitros();
        this.contenido = deposito.getContenido();
        deposito.extraer(deposito.getLitros());
        deposito.contenido = null;



    }

    public void dibujar(int numero){

        int pordentaje = (int) Math.round(getPorcentaje());
        int punto;
        punto = pordentaje * numero / 100;

        System.out.print("|");
        numero = numero - punto;

        for (int i = 0; i < punto; i++){
            System.out.print("#");
        }
        for (int i = 0; i < numero; i++){
            System.out.print(".");
        }
        System.out.print("|");
    }





}
