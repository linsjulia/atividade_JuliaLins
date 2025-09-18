public class Ex4 {
    public static void main(String[] args) {
        int[][] matriz = {{2, 4, 5}, {0, 3, 6}, {0, 0, 7}};
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
        
        int determinante = 1;
        for (int i = 0; i < matriz.length; i++) {
            determinante *= matriz[i][i];
        }
        System.out.println("Determinante: " + determinante);
    }
}

// Os autovalores desta matriz 2, 3, 7

