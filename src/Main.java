import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {



        Professor prof1 = new Professor("Tancredo", 12332132112L,"professor","123" );

        BancoDeDados.addProfessor(prof1);

        login();

    }

    public static void login(){
        boolean logado = false;
        int contagemErros = 0;

        while (logado == false) {

            if (contagemErros >= 3 ){
                System.err.println("Excedeu a quantidade maxima de erros!\n Programa finalizado!");
                System.exit(0);
            }

            System.out.println("Digite o seu login");
            String login = sc.next();

            System.out.println("Digite a sua senha");
            String senha = sc.next();

            for (Professor professor : BancoDeDados.getProfessores()) {
                if (professor.getLogin().equals(login) && professor.getSenha().equals(senha)) {
                    logado = true;
                    break;
                }
            }
            System.err.println("Errou o login ou a senha, você tem 3 tentativas totais! ");
            contagemErros++;
        }
        gerenciamento();

    }


    public static void gerenciamento(){
        System.out.println("Funcionou");
    }
}
