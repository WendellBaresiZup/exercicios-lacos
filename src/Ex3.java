import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = scanner.nextInt();

        if (n == 0){
            System.out.println("O número possui um digito.");
        }else {
            int c = 0;
            int tempo = Math.abs(n);

            while (tempo > 0){
                tempo /= 10;
                c++;
            }

            System.out.println("número " + n + " possui " + c + " dígitos.");
        }
        scanner.close();
    }
}
