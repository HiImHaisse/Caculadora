package UI;
import Suma.Rest.Mul.*;

import java.util.Scanner;

public class Main {
    private static Scanner entrada;
    private static SumaDiviResMul calculadora;

    public static void main(String[] args)
    {
        calculadora = new SumaDiviResMul();
        entrada = new Scanner(System.in);
        inicio();
    }

    public static void menu(){
        int opcion;
        do{
            opcion= entrada.nextInt();
            switch ( opcion)
            {
                case 1:
                    calculadora.inicio();
                    break;
            }
        } while(opcion!=0);
    }

    public static void inicio(){
        System.out.println("Operaciones básicas  -  1");
        System.out.println("Operaciones tablas de multiplicar -  2");
        System.out.println("Operaciones calificación-  3");
        System.out.println("Operaciones con binomios -  4");
        menu();
    }
}
