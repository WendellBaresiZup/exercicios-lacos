import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base: ");
        double base = scanner.nextDouble();

        System.out.println("Digite o expoente: ");
        double expoente = scanner.nextDouble();

        double resultado = 1;

        for (double c = 0; c < expoente; c++){
            resultado *= base;
        }

        System.out.println(base + " elevado a " + expoente + " é " + resultado);

        scanner.close();
    }
}
