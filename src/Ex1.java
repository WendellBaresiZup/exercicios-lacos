import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = scanner.nextInt();

        int soma = 0;

        for (int c = 1; c <= n; c++){
            soma += c;
        }

        System.out.println("A soma dos números " + n + " é: " + soma);

        scanner.close();
    }
}
