public class Professor {

    private static int geradorDeCodigo = 0;
    private int Codigo;
    private String nome;
    private long cpf;
    private String login;
    private String senha;

    public Professor(String nome, long cpf, String login, String senha) {
        this.Codigo = geradorDeCodigo++;
        this.nome = nome;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
