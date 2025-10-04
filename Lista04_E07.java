import java.util.Scanner;

public class Lista04_E07 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n1,n2,n3,n4,n5, maior;

        System.out.print("Digite o primeiro número: ");
        n1 = scanner.nextInt();     
        System.out.print("Digite o segundo número: ");
        n2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        n3 = scanner.nextInt();     
        System.out.print("Digite o quarto número: ");
        n4 = scanner.nextInt();
        System.out.print("Digite o quinto número: ");
        n5 = scanner.nextInt();

        maior = n1;
        if (n2 > maior) {
            maior = n2;
        }
        if (n3 > maior) {
            maior = n3;
        }
        if (n4 > maior) {
            maior = n4;
        }
        if (n5 > maior) {
            maior = n5;
        }

        System.out.println("O maior número é: " + maior);
        

        
        //Sempre fechar
        scanner.close();
    }
}
