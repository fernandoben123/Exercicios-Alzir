public class contagem {
    public static void main(String[] args) {
        int[] dados = {1, 7};

        int primeiro = dados[0];
        int ultimo = dados[dados.length - 1];

        int contagem = 0;

        for (int i = primeiro; i <= ultimo; i++) {
            contagem++;
        }

        System.out.println("Total de inteiros: " + contagem);
    }
}
