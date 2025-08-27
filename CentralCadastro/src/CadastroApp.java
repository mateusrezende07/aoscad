import java.util.Scanner;

public class CadastroApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CentralCadastro central = new CentralCadastro();
        int opcao;

        do {
            System.out.println("\n=== CENTRAL DE CADASTRO ===");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Listar Usuários");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome Completo: ");
                    String nome = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Data de Nascimento (dd/mm/aaaa): ");
                    String data = sc.nextLine();
                    System.out.print("Nickname: ");
                    String nickname = sc.nextLine();
                    System.out.print("Senha: ");
                    String senha = sc.nextLine();

                    Usuario u = new Usuario(nome, email, data, nickname, senha);
                    central.cadastrarUsuario(u);
                    break;
                case 2:
                    central.listarUsuarios();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}

