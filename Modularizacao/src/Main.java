public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        int a = 5;
        int b = 5;

        System.out.println("Soma: " + soma (a, b));
        System.out.println("Subtração: " + subtracao (a,b));
        System.out.println("Multiplicação: " + multiplicacao (a, b));
        System.out.println("Divisão: " + divisao (a, b));
    }
    public static int soma(int a, int b) {
        return a + b;
    }

    public static int subtracao(int a, int b) {
        return a - b;
    }
    public static int multiplicacao(int a, int b) {
        return a * b;
    }
    public static int divisao(int a, int b) throws IllegalAccessException {
        if (b == 0) {
            throw new IllegalAccessException ("Divisões por Zero não são permitidas");
        }
        return  a / b;
    }

}
