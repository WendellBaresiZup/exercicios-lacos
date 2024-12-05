import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = scanner.nextInt();

        int nInvertido = 0;

        while (n != 0){
            int numeroDigitado = n % 10;
            nInvertido = nInvertido * 10 + numeroDigitado;
            n = n / 10;
        }

        System.out.println("Número invertido : " + nInvertido);

        scanner.close();
    }
}
