public class ex3 {
    public static void main(String[] args) {

        int[][] imagem = {
            {10, 10, 10, 10},
            {10, 100, 100, 10},
            {10, 100, 100, 10},
            {10, 10, 10, 10}
        };

        int[][] filtro = {
            {-1, 0, 1},
            { 0, 0, 0},
            { 1, 0,-1}
        };


        int[][] imagemFiltrada = aplicarFiltro(imagem, filtro);


        System.out.println("Imagem após aplicar o filtro diagonal:");
        for (int i = 0; i < imagemFiltrada.length; i++) {
            for (int j = 0; j < imagemFiltrada[i].length; j++) {
                System.out.print(imagemFiltrada[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] aplicarFiltro(int[][] imagem, int[][] filtro) {
        int tamanho = imagem.length;
        int[][] imagemFiltrada = new int[tamanho][tamanho];

        for (int i = 1; i < tamanho - 1; i++) {
            for (int j = 1; j < tamanho - 1; j++) {
                int valor = 0;

                for (int fi = 0; fi < 3; fi++) {
                    for (int fj = 0; fj < 3; fj++) {
                        valor += imagem[i - 1 + fi][j - 1 + fj] * filtro[fi][fj];
                    }
                }
                imagemFiltrada[i][j] = Math.abs(valor);  
            }
        }

        return imagemFiltrada;
    }
}
// Esse filtro identifica bordas diagonais porque ele compara os valores dos pixels ao longo das diagonais da imagem. Ele foca nas diferenças de intensidade ao longo dessas direções (superior-esquerda para inferior-direita e inferior-esquerda para superior-direita), que são características das bordas diagonais. O filtro gera uma resposta forte quando há uma transição abrupta de intensidade nessas direções.