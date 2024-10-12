import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        Integer opcion = 0;
        double valor = 0;
        Validador validador = new Validador();
        Menu menu = new Menu();
        Scanner teclado = new Scanner(System.in);

        while (opcion != 7) {
            menu.mostrar();
            opcion = validador.obtenerOpcion(teclado);

            try {
                switch (opcion) {
                    case 1:
                        valor = validador.obtenerValor(teclado);
                        Conversion conversionCase1 = new Conversion("USD", "ARS", valor);
                        System.out.println("El valor de: " + valor + " " + conversionCase1.monedaInicial +
                                " corresponde a: " + conversionCase1.getValorFinal() + " " + conversionCase1.monedaFinal);
                        break;
                    case 2:
                        valor = validador.obtenerValor(teclado);
                        Conversion conversionCase2 = new Conversion("ARS", "USD", valor);
                        System.out.println("El valor de: " + valor + " " + conversionCase2.monedaInicial +
                                " corresponde a: " + conversionCase2.getValorFinal() + " " + conversionCase2.monedaFinal);
                        break;
                    case 3:
                        valor = validador.obtenerValor(teclado);
                        Conversion conversionCase3 = new Conversion("USD", "BRL", valor);
                        System.out.println("El valor de: " + valor + " " + conversionCase3.monedaInicial +
                                " corresponde a: " + conversionCase3.getValorFinal() + " " + conversionCase3.monedaFinal);
                        break;
                    case 4:
                        valor = validador.obtenerValor(teclado);
                        Conversion conversionCase4 = new Conversion("BRL", "USD", valor);
                        System.out.println("El valor de: " + valor + " " + conversionCase4.monedaInicial +
                                " corresponde a: " + conversionCase4.getValorFinal() + " " + conversionCase4.monedaFinal);
                        break;
                    case 5:
                        valor = validador.obtenerValor(teclado);
                        Conversion conversionCase5 = new Conversion("USD", "COP", valor);
                        System.out.println("El valor de: " + valor + " " + conversionCase5.monedaInicial +
                                " corresponde a: " + conversionCase5.getValorFinal() + " " + conversionCase5.monedaFinal);
                        break;
                    case 6:
                        valor = validador.obtenerValor(teclado);
                        Conversion conversionCase6 = new Conversion("COP", "USD", valor);
                        System.out.println("El valor de: " + valor + " " + conversionCase6.monedaInicial +
                                " corresponde a: " + conversionCase6.getValorFinal() + " " + conversionCase6.monedaFinal);
                        break;
                    case 7:
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println(e);
            }
        }
    }
}

