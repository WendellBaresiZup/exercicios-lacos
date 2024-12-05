import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = scanner.nextInt();

        int fator = 1;
        int c = 1;

        while (c <= n){
            fator *= c;
            c++;
        }
    }
}
