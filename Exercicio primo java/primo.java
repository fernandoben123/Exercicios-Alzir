public class primo {
    public static void main(String[] args) {
        int numero = 5;
        boolean primo = true;

        if (numero <= 1) {
            primo = false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = false;
                break; 
            }
        }

        if (primo) {
            System.out.println(numero + " e primo");
        } else {
            System.out.println(numero + " nao e primo");
        }
    }
}
