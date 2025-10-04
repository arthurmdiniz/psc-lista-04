import java.util.Scanner;

public class Lista04_E08 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n1,n2,n3,n4,n5, soma,media;

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

        soma = n1 + n2 + n3 + n4 + n5;
        media = soma / 5;  
        
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
        

        
        //Sempre fechar
        scanner.close();
    }
}
