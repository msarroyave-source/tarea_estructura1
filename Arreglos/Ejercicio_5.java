package Arreglos;
import java.util.Random;

public class Ejercicio_5 {

    public static int invertirNumero(int numero){

        int invertido = 0;

        while(numero != 0){
            invertido = invertido * 10 + numero % 10;
            numero /= 10;
        }

        return invertido;
    }

    public static void main(String[] args) {

        Random random = new Random();

        int[] numeros = new int[20];
        int[] invertidos = new int[20];

        for(int i=0;i<20;i++){
            numeros[i] = random.nextInt(1000);
            invertidos[i] = invertirNumero(numeros[i]);
        }

        System.out.println("Original:");
        for(int n : numeros){
            System.out.print(n + " ");
        }

        System.out.println("\nInvertidos:");
        for(int n : invertidos){
            System.out.print(n + " ");
        }
    }
}