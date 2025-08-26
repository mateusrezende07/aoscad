import java.util.ArrayList;
import java.util.List;

public class CentralCadastro {
    private List<Usuario> usuarios;

    public CentralCadastro() {
        this.usuarios = new ArrayList<>();
    }

    public boolean cadastrarUsuario(Usuario usuario) {
        // Verifica duplicidade
        for (Usuario u : usuarios) {
            if (u.getEmail().equalsIgnoreCase(usuario.getEmail())) {
                System.out.println("Erro: Email já cadastrado!");
                return false;
            }
            if (u.getNickname().equalsIgnoreCase(usuario.getNickname())) {
                System.out.println("Erro: Nickname já cadastrado!");
                return false;
            }
        }

        usuarios.add(usuario);
        System.out.println("Cadastro realizado com sucesso: " + usuario);
        return true;
    }

    public void listarUsuarios() {
        System.out.println("\n--- Lista de Usuários ---");
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }
}
