
package Matrices;
import java.util.Random;

public class Ejercicio_12 {

    public static void main(String[] args) {

        Random random = new Random();

        int n = 5;

        int[][] matriz = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matriz[i][j] = random.nextInt(101) - 50;
            }
        }

        int suma = 0;

        for(int i=0;i<n;i++){
            suma += matriz[i][n-1-i];
        }

        System.out.println("Matriz:");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Suma diagonal secundaria: " + suma);
    }
}