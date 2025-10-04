//import java.util.Scanner;

public class Lista04_E04 {
    public static void main(String[] args) {
        //java.util.Scanner scanner = new java.util.Scanner(System.in);

        int paisA = 80000, paisB = 200000, anos = 0;
        double taxaA = 0.03, taxaB = 0.015;
        while (paisA < paisB) {
            paisA += paisA * taxaA;
            paisB += paisB * taxaB;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para que a população do país A ultrapasse a população do país B.");
        
        //Sempre fechar
        //scanner.close();
    }
}
