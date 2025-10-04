import java.util.Scanner;

public class Lista04_E01 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double nota;

        do {
            System.out.print("Informe uma nota(entre 0 e 10): ");
            nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida, reiniciando.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota válida: " + nota);
        scanner.close();
    }
}
