package Arreglos;
import java.util.Random;
public class Ejercicio_3 {
    public static long factorial( int n){

        long factorial = 1;

        for(int i =1; i <= n; i++){
            factorial= factorial *i;
        }
        return factorial;
    }

    public static void main(String[] args) {

        Random random = new Random();
        int n = 10;
        
          int[] numeros = new int[n];
        long[] factoriales = new long[n];

        for(int i=0;i<n;i++){
            numeros[i] = random.nextInt(10)+1;
            factoriales[i] = factorial(numeros[i]);
        }

        System.out.println("Numeros:");
        for(int numero : numeros){
            System.out.print(numero + " ");
        }

        System.out.println("\nFactoriales:");
        for(long f : factoriales){
            System.out.print(f + " ");
        }
        
    }


}
