import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = scanner.nextInt();

        int nPrincipal = n;

        int nInvertido = 0;

        while (n != 0){
            int numeroDigitado = n % 10;
            nInvertido = nInvertido * 10 + numeroDigitado;
            n = n / 10;
        }

        System.out.println("Número invertido " + nInvertido);

        if (nPrincipal == nInvertido){
            System.out.println("O número " + nPrincipal + " é um palíndromo = " + true);
            //System.out.println(true);
        }else {
            System.out.println("O número " + nPrincipal + " não é um palindromo = " + false);
            //System.out.println(false);
        }

        scanner.close();
    }
}
