import java.util.Scanner;

public class Lista04_E02 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String nomeUsuario, senha;

        while (true) {
            System.out.print("Digite o nome de usuário: ");
            nomeUsuario = scanner.nextLine();

            System.out.print("Digite a senha: ");
            senha = scanner.nextLine();

            if (senha.equals(nomeUsuario)) {
                System.out.println("Erro: A senha não pode ser igual ao nome de usuário. Tente novamente.");
            } else {
                System.out.println("Cadastro realizado com sucesso!");
                break;
            }
        }
        scanner.close();
    }
}
