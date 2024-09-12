public class mdc {
    public static int calcularMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 90;

        int mdc = calcularMDC(num1, num2);
        System.out.println("O MDC de " + num1 + " e " + num2 + " é: " + mdc);
    }
}

