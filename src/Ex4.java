import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = scanner.nextInt();

        if (n <= 1){
            System.out.println("O número " + n + "não é primo.");
        }else {
            boolean primo = true;

            for (int c = 2; c <= Math.sqrt(n); c++){
                if (n % c == 0){
                    primo = false;
                    break;
                }
            }

            if (primo){
                System.out.println("O número " + n + " é primo.");
                System.out.println(true);
            } else {
                System.out.println("O número " + n + " não é primo.");
                System.out.println(false);
            }
        }


    }
}
