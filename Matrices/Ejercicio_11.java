package Matrices;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_11 {

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        Random random = new Random();

        int m = 5;
        int n = 5;

        int[][] matriz = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matriz[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Matriz:");

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Ingrese numero a buscar:");
        int numero = Scanner.nextInt();

        boolean encontrado = false;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                if(matriz[i][j] == numero){
                    System.out.println("Encontrado en posicion ["+i+"]["+j+"]");
                    encontrado = true;
                    break;
                }
            }

            if(encontrado) break;
        }

        if(!encontrado){
            System.out.println("El numero no se encuentra en la matriz");
        }
    }
}