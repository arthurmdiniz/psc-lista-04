import java.util.Scanner;

public class Lista04_E03 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String nome;
        int idade;
        double salario;
        char sexo, estadoCivil;
        
        do {
            System.out.print("Digite seu nome (mais de 3 caracteres): ");
            nome = scanner.nextLine();

            if (nome.length() <= 3) {
                System.out.println("Nome inválido, reiniciando.");
            }
        } while (nome.length() <= 3);

        do {
            System.out.print("Digite sua idade (0 até 150): ");
            idade = scanner.nextInt();

            if (idade < 0 || idade > 150) {
                System.out.println("Idade inválida, reiniciando.");
            }
        } while (idade < 0 || idade > 150);

        do {
            System.out.print("Digite seu salário (maior que 0): R$");
            salario = scanner.nextDouble();

            if (salario <= 0) {
                System.out.println("Entendo que a situação ta dificil, mas o salário informado é inválido, reiniciando.");
            }
        } while (salario <= 0);

        do {
            System.out.print("Digite seu sexo (F ou M): ");
            sexo = scanner.next().charAt(0);

            if (sexo != 'f' && sexo != 'F' && sexo != 'm' && sexo != 'M') {
                System.out.println("Sexo inválido, reiniciando.");
            }
        } while (sexo != 'f' && sexo != 'F' && sexo != 'm' && sexo != 'M');

        do {
            System.out.print("Digite seu estado civil (S, C, V ou D): ");
            estadoCivil = scanner.next().charAt(0);

            if (estadoCivil != 's' && estadoCivil != 'S' && estadoCivil != 'c' && estadoCivil != 'C' &&
                estadoCivil != 'v' && estadoCivil != 'V' && estadoCivil != 'd' && estadoCivil != 'D') {
                System.out.println("Estado civil inválido, reiniciando.");
            }
        } while (estadoCivil != 's' && estadoCivil != 'S' && estadoCivil != 'c' && estadoCivil != 'C' &&
                 estadoCivil != 'v' && estadoCivil != 'V' && estadoCivil != 'd' && estadoCivil != 'D');

        System.out.println("\nTodos os campos foram validados, encerrando.");

        //Sempre fechar
        scanner.close();
    }
}
