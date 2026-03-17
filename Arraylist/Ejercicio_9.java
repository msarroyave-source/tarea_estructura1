package Arraylist;
import java.util.*;

public class Ejercicio_9 {

    public static void main(String[] args) {

        Random random = new Random();

        ArrayList<Integer> lista = new ArrayList<>();

        for(int i=0;i<20;i++){
            lista.add(random.nextInt(100)+1);
        }

        System.out.println("Original: " + lista);

        Collections.sort(lista);
        System.out.println("Ascendente: " + lista);

        Collections.sort(lista, Collections.reverseOrder());
        System.out.println("Descendente: " + lista);

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for(int n : lista){
            if(n % 2 == 0){
                pares.add(n);
            }else{
                impares.add(n);
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }
}