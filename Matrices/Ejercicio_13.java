package Matrices;
import java.util.Random;

public class Ejercicio_13 {

    public static void main(String[] args) {

        Random random = new Random();

        int n = 4;

        int[][] matriz = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matriz[i][j] = random.nextInt(10);
            }
        }

        boolean simetrica = true;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                if(matriz[i][j] != matriz[j][i]){
                    simetrica = false;
                }

            }
        }

        System.out.println("Matriz:");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        if(simetrica){
            System.out.println("La matriz es simetrica");
        }else{
            System.out.println("La matriz no es simetrica");
        }

        System.out.println("Esquinas:");

        System.out.println(matriz[0][0]);
        System.out.println(matriz[0][n-1]);
        System.out.println(matriz[n-1][0]);
        System.out.println(matriz[n-1][n-1]);
    }
}