package Arraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();

        for(int i=1;i<=20;i++){
            lista.add(i*2);
        }

        System.out.println(lista);

        System.out.println("Ingrese numero:");
        int numero = Scanner.nextInt();

        int pos = 0;

        while(pos < lista.size() && lista.get(pos) < numero){
            pos++;
        }

        lista.add(pos,numero);

        System.out.println(lista);

        System.out.println("Numero a eliminar:");
        int eliminar = Scanner.nextInt();

        lista.remove(Integer.valueOf(eliminar));

        System.out.println(lista);
    }
}