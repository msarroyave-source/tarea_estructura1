package Arraylist;
import java.util.ArrayList;
import java.util.Random;

public class Ejercicio_6 {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        Random random = new Random();

        int numero;
        int suma = 0;

        do{
            numero = random.nextInt(21) - 10;
            lista.add(numero);
            suma += numero;
        }while(numero != 10);

        System.out.println("Numeros: " + lista);

        double media = (double)suma / lista.size();

        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
    }
}