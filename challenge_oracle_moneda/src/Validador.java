import java.util.InputMismatchException;
import java.util.Scanner;

public class Validador {

    //Validar que la opcion este dentro del rango y que sea un valor numerico
    public int obtenerOpcion (Scanner teclado) {
        int opcion = 0;
        boolean opcionValida = false;

        while (!opcionValida) {
            System.out.println("ingrese la opcion del menu: ");
            try {
                opcion = teclado.nextInt();
                if (opcion >= 1 && opcion <= 7) {
                    opcionValida = true;
                }else{
                    System.out.println("Error: Opcion no valida, debe ingresar un numero de 1 al 7");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: El valor debe ser numerico");
                teclado.next();
            }
        }
        return opcion;
    }

    //Validar que el valor a convertir sea numerico
    public double obtenerValor (Scanner teclado) {
        double valor = 0;
        boolean valorValido = false;

        while (!valorValido) {
            System.out.println("Ingrese el valor que desea convertir: ");
            try {
                valor = teclado.nextDouble();
                valorValido = true;
            }catch (InputMismatchException e){
                System.out.println("Error: El valor a ingresar debe ser numerico");
                teclado.next();
            }
        }
        return valor;
    }

}
