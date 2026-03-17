package Arreglos;
import java.util.Random;
public class Ejejrcicio_4 {
     public static void main(String[] args) {

        Random random = new Random();

        int[] numeros = new int[25];

        int menor = 100;
        int mayor = -100;

        for(int i=0;i<25;i++){
            numeros[i] = random.nextInt(101) - 50;

            if(numeros[i] < menor){
                menor = numeros[i];
            }

            if(numeros[i] > mayor){
                mayor = numeros[i];
            }
        }

        System.out.println("Numeros:");

        for(int numero : numeros){
            System.out.print(numero + " ");
        }

        System.out.println("\nMenor: " + menor);
        System.out.println("Mayor: " + mayor);
    }
}
