package ejercicio2;

import java.util.Scanner;

public class EjercicioDeposito {
    public static void main(String[] args) throws Exception {
        Deposito deposito = new Deposito(100, Contenido.agua);
        System.out.println(deposito.estaVacio());
        deposito.llenar(60, Contenido.agua);
        deposito.extraer(10);
        System.out.println(deposito.getPorcentaje());
        Deposito deposito2 = new Deposito(100);
        deposito2.tansvasar(deposito);
        System.out.println(deposito2);
        System.out.println(deposito);
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        deposito2.dibujar(numero);

    }


}
