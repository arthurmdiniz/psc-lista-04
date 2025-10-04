import java.util.Scanner;

public class Lista04_E10 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n1,n2;

        do {
            System.out.print("Digite o primeiro número: ");
            n1 = scanner.nextInt();
            System.out.print("Digite o segundo número: ");
            n2 = scanner.nextInt();
        } while (n1 > n2);

        System.out.print("Números no intervalo: ");
        for (int i = n1; i <= n2; i++) {
            System.out.print(i + " ");
        }
        
        //Sempre fechar
        scanner.close();
    }
}
