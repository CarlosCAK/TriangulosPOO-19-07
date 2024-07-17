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

            if (contagemErros > 0) System.err.println("Errou o login ou a senha, você tem 3 tentativas totais! ");
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

            contagemErros++;
        }
        gerenciamento();

    }


    public static void gerenciamento(){
        System.out.println("Olá professor ! O que deseja"+
                            "\n1- Cadastrar um circulo" +
                            "\n2- Cadastrar um Quadrado" +
                            "\n3- Cadastrar um Retângulo" +
                            "\n4- Cadastrar um Triâgulo" +
                            "\n5- Listar todas as formas" +
                            "\n6- Listar todos os quadrados" +
                            "\n7- Listar todos os circulos" +
                            "\n8- Listar todos os triângulos" +
                            "\n9- Listar todos os retângulos"+
                            "\n10- Sair da conta ");

        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                cadastarCirculo();
                break;
            case 2 :
                cadastrarQuadrado();
                break;
            case 3:
                cadastarRetangulo();
                break;
            case 4:
                cadastrarTriangulo();
                break;
            case 5:
                imprimirTodasAsFormas();
                break;
        }


    }
    static void cadastarCirculo(){

        System.out.println("Digite o raio do circulo");
        Circulo c1 = new Circulo(sc.nextDouble());

        BancoDeDados.addForma(c1);

        gerenciamento();
    }
    static void cadastrarQuadrado(){

        System.out.println("Digite o valor de um lado do quadrado");
        Quadrado q1 = new Quadrado(sc.nextDouble());

        BancoDeDados.addForma(q1);

        gerenciamento();
    }
    static void cadastarRetangulo(){
        boolean retangulo = false;
        double lado1 = 0, lado2 = 0;

        while (!retangulo){
            System.out.println("Digite o primeiro lado do retângulo");
             lado1 = sc.nextDouble();

            System.out.println("Digite o segundo lado do retângulo");
             lado2 = sc.nextDouble();

            if (lado1 != lado2){
                retangulo = true;
                break;
            }
            System.err.println("Os valores digitados nao formam um retângulo!");
        }
        Retangulo r1 = new Retangulo(lado1, lado2);

        BancoDeDados.addForma(r1);
        gerenciamento();
    }
    static void cadastrarTriangulo(){

        System.out.println("Digite os lados do triangulo");

        double lado1 = 0, lado2 = 0 , lado3 = 0;
        boolean triangulo = false;

        while (!triangulo){
            System.out.println("lado 1 :");
            lado1 = sc.nextDouble();

            System.out.println("lado 2 :");
            lado2 = sc.nextDouble();

            System.out.println("lado 3 :");
            lado3 = sc.nextDouble();

            if(lado1 + lado2 > lado3 || lado1 + lado3 > lado2 || lado2 + lado3 >lado1){
                triangulo = true;
                break;
            }
            System.err.println("Os lados fornecidos não formam um triângulo");
        }
        Triangulo t1;
        // verificando se é isóceles
        if((lado1 == lado2 && lado2 != lado3) || (lado1 == lado3 && lado3 != lado2) || (lado2 == lado3 && lado3 != lado1)){
           t1  = new TrianguloIsoceles(lado1,lado2,lado3);
        }
        // verificando se é equilatero
        else if(lado1 == lado2 && lado2 == lado3){
            t1 = new TrianguloEquilatero(lado1,lado2,lado3);
        }
        else{
             t1 = new TrianguloEscaleno(lado1,lado2,lado3);
        }
        BancoDeDados.addForma(t1);

        gerenciamento();
    }
    static void imprimirTodasAsFormas(){

        for (Forma forma : BancoDeDados.getFormas()){
            System.out.println(forma.toString());
        }
        gerenciamento();
    }
}
