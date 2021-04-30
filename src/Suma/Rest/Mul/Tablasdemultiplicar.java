package Suma.Rest.Mul;
public class Tablasdemultiplicar {
    public static void main(String[] args) {
        System.out.println("Tabla de multiplicar ");
        for (int multiplicador = 1; multiplicador < 11; multiplicador++) {
            System.out.println();
            for (int multiplicando = 1; multiplicando < 11; multiplicando++) {
                System.out.printf("%2d X %2d = %3d\t", multiplicando, multiplicador, (multiplicando * multiplicador));
            }
        }
    }
}