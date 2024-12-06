import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos exibir a Série de Fibonacci");

        int aNumero = 0;

        int bNumero = 1;

        for (int c = 0; c < 7; c++){
            System.out.println("O resultado de Fibonacci é: " + aNumero);
            bNumero = aNumero + bNumero;
            aNumero = bNumero - aNumero;
        }
    }
}
