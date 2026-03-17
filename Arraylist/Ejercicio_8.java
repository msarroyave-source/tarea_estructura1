package Arraylist;
import java.util.ArrayList;
import java.util.Random;

public class Ejercicio_8 {

    public static void main(String[] args) {

        Random random = new Random();

        ArrayList<Integer> lista = new ArrayList<>();

        for(int i=0;i<100;i++){
            lista.add(random.nextInt(20)+1);
        }

        int maxFrecuencia = 0;
        int numeroMax = 0;

        for(int i=1;i<=20;i++){

            int contador = 0;

            for(int numero : lista){
                if(numero == i){
                    contador++;
                }
            }

            System.out.println(i + " aparece " + contador + " veces");

            if(contador > maxFrecuencia){
                maxFrecuencia = contador;
                numeroMax = i;
            }
        }

        System.out.println("Numero mas frecuente: " + numeroMax);
    }
}