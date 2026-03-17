package Matrices;
public class Ejercicio_14 {

    public static void main(String[] args) {

        int[][] matriz = {
                {1,2,3},
                {4,5,6}
        };

        int m = matriz.length;
        int n = matriz[0].length;

        int[][] transpuesta = new int[n][m];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                transpuesta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz original:");

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz transpuesta:");

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
}