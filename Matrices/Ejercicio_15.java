package Matrices;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_15 {

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Filas:");
        int m = Scanner.nextInt();

        System.out.println("Columnas:");
        int n = Scanner.nextInt();

        int[][] matriz = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matriz[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Matriz original:");

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        for(int j=0;j<n;j++){

            int temp = matriz[0][j];
            matriz[0][j] = matriz[1][j];
            matriz[1][j] = temp;

        }

        System.out.println("Matriz despues de intercambiar filas:");

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}