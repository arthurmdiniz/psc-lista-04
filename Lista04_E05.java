import java.util.Scanner;

public class Lista04_E05 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int paisA =0 , paisB=0 , anos=0;
        double taxaA=0, taxaB=0;

        do {
            System.out.print("Informe população do país A: ");
            paisA = scanner.nextInt();
            if (paisA <= 0) {
                System.out.println("População inválida, reiniciando.");
            }

        }while (paisA <= 0);

        do{
            System.out.print("Informe taxa de crescimento do país A (em %): ");
            taxaA = scanner.nextDouble();
            if (taxaA <= 0) {
                System.out.println("Taxa inválida, reiniciando.");
            }
        } while (taxaA <= 0);



        do {
            System.out.print("Informe população do país B: ");
            paisB = scanner.nextInt();
            if (paisB <= 0 || paisB <= paisA) {
                System.out.println("População inválida, reiniciando.");
            }

        } while (paisB <= 0 || paisB <= paisA);

        do{
            System.out.print("Informe taxa de crescimento do país B (em %): ");
            taxaB = scanner.nextDouble();
            if (taxaB <= 0 || taxaB >= taxaA) {
                System.out.println("Taxa inválida, reiniciando.");
            }
        } while (taxaB <= 0 || taxaB >= taxaA);

        taxaA = taxaA / 100;
        taxaB = taxaB / 100;
        anos = 0;   

        while (paisA < paisB) {
            paisA += paisA * taxaA;
            paisB += paisB * taxaB;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para que a população do PaísA ultrapasse a população do PaísB.");
        
        //Sempre fechar
        scanner.close();
    }
}
