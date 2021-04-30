package Suma.Rest.Mul;
import java.util.Scanner;
public class SumaDiviResMul {

    private int opcion;
    private int suma;
    private int tam, num;
    private int acum = 0;
    private Scanner entrada;

    public SumaDiviResMul() {
        entrada = new Scanner(System.in);
    }



    public void inicio() {//
        System.out.println("Bienvenido, esta opción permite realizar las operaciones básicas\n" +
                "Suma , resta , multiplicación , División \n" +
                "Escoge la operación a realizar" +
                "*******************************\n" +
                "* Operación      * Opción     *\n" +
                "* Suma           * 1          *\n" +
                "* Resta          * 2          *\n" +
                "* División       * 3          *\n" +
                "* Multiplicación * 4          *\n" +
                "*******************************\n");
        System.out.println("Digite la opción que desea usar: ");
        opcion = entrada.nextInt();
        if (opcion ==1){
            hacerSuma();
        }
    }

    public void hacerSuma(){
        System.out.println("Opción 1: Suma");
        System.out.println("Cuántos número desea sumar");
        int cantidad = entrada.nextInt();
        for (int i = 0; i < cantidad; i++) {
            System.out.printf("Digite el %d digito:", i + 1);
            num = entrada.nextInt();
            acum += num;
        }
        System.out.println("El resultado de la suma es:" + acum);
        }
}





