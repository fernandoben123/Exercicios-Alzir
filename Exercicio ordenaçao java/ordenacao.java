import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ordenacao {
    public static List<Integer> quickSort(List<Integer> array) {
        if (array.size() <= 1) {
            return array;
        }


        int pivo = array.get(0);

        List<Integer> menores = new ArrayList<>();
        List<Integer> maiores = new ArrayList<>();

        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) < pivo) {
                menores.add(array.get(i));
            } else {
                maiores.add(array.get(i));
            }
        }

        List<Integer> resultado = new ArrayList<>(quickSort(menores));
        resultado.add(pivo);
        resultado.addAll(quickSort(maiores));

        return resultado;
    }

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(8, 3, 1, 7, 0, 10, 2);

        List<Integer> numerosOrdenados = quickSort(numeros);

        System.out.println("Lista ordenada: " + numerosOrdenados);
    }
}

