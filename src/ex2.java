public class ex2 {
    public static void main(String[] args) {
        int[][] matrizAdjacencia = new int[3][3];
        matrizAdjacencia[0][1] = 1;
        matrizAdjacencia[1][2] = 1;
        matrizAdjacencia[0][0] = 1;

 
        System.out.println("Matriz de Adjacência:");
        for (int i = 0; i < matrizAdjacencia.length; i++) {
            for (int j = 0; j < matrizAdjacencia[i].length; j++) {
                System.out.print(matrizAdjacencia[i][j] + " ");
            }
            System.out.println();
        }
    
        System.out.println("\nAuto-laço em A (A → A): " + (matrizAdjacencia[0][0] == 1 ? "Sim" : "Não"));

        System.out.println("A e B são vizinhos? " + (matrizAdjacencia[0][1] == 1 ? "Sim" : "Não"));

        System.out.println("B e C são vizinhos? " + (matrizAdjacencia[1][2] == 1 ? "Sim" : "Não"));

        System.out.println("A e C são vizinhos? " + (matrizAdjacencia[0][2] == 1 ? "Sim" : "Não"));
    }
}
// Para verificar se dois nós são vizinhos usando a matriz de adjacência, basta olhar o valor da célula correspondente na matriz.
// A matriz de adjacência é usada para verificar a existência de arestas entre os vértices. Se o valor na célula correspondente for 1, existe uma aresta entre os vértices; caso contrário, se for 0, não existe aresta entre eles.