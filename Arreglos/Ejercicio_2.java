package Arreglos;

public class Ejercicio_2 {
    public static void main(String[] args)
    {
        int [] pares = new int [100];
        for (int i = 0; i < 100; i ++){
            pares[i] = (i + 1) * 2;
        }
        System.out.println("en una sola linea:");
        for (int numero : pares){
            System.out.print( numero + " ");

        }
        System.out.println("\n\n En 10 lineas: ");

        for (int i = 0; i <100; i ++){
            if (i % 10 == 0){
                System.out.println("\nLinea "+ (i/10 + 1));
            }
            System.out.print( pares[i] + " ");


        }

    }
}
