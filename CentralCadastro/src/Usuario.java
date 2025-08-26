public class Usuario {
    private String nomeCompleto;
    private String email;
    private String dataNascimento;
    private String nickname;
    private String senha;

    public Usuario(String nomeCompleto, String email, String dataNascimento, String nickname, String senha) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.nickname = nickname;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public String getNickname() {
        return nickname;
    }

    @Override
    public String toString() {
        return "Usuário: " + nomeCompleto +
                " | Email: " + email +
                " | Data de Nascimento: " + dataNascimento +
                " | Nickname: " + nickname;
    }
}
