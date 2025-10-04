//import java.util.Scanner;

public class Lista04_E06 {
    public static void main(String[] args) {
        //java.util.Scanner scanner = new java.util.Scanner(System.in);

        int numero = 1;

        System.out.println("Abaixo: ");

        while (numero < 21){
            System.out.println(numero);
            numero++;
        }
        
        System.out.println("Ao lado: ");
        numero = 1;
        while (numero < 21){
            System.out.print(numero + " ");
            numero++;
        }   


        
        //Sempre fechar
        //scanner.close();
    }
}
