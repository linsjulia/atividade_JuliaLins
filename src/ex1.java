public class ex1 {
    public static void main(String[] args) {
        int[][] matriz = {
            {3, 1},  
            {2, 4} 
        };

        System.out.println("Sistema linear correspondente:");
        System.out.println("3x + y = 0");
        System.out.println("2x + 4y = 0");

        System.out.println("\nDiagonal principal da matriz:");
        System.out.println("Diagonal: " + matriz[0][0] + ", " + matriz[1][1]);
    }
}

//Importância da diagonal principal no método de Gauss-Seidel: A diagonal principal é importante para garantir a estabilidade e convergência do método. Ela ajuda a iterar corretamente as variáveis e é usada como base para a solução iterativa.
