public class somatorio {
    public static void main(String[] args) {
        int[] lista = {0, 1, 2, 3, 4};
        int soma = 0;

        for (int i = 0; i < lista.length; i++) {
            soma += lista[i];
        }
        System.out.println("A soma dos elementos e: " + soma);
    }
}

