import java.util.ArrayList;

public class BancoDeDados {
    private static ArrayList<Professor> professores = new ArrayList<>();
    private static ArrayList<Forma> formas = new ArrayList<>();

    public static ArrayList<Professor> getProfessores() {
        return professores;
    }

    public static void setProfessores(ArrayList<Professor> professores) {
        BancoDeDados.professores = professores;
    }

    public static ArrayList<Forma> getFormas() {
        return formas;
    }

    public static void setFormas(ArrayList<Forma> formas) {
        BancoDeDados.formas = formas;
    }

    public static void addProfessor(Professor professor){
        BancoDeDados.professores.add(professor);
    }
    public static void addForma(Forma forma){
        BancoDeDados.formas.add(forma);
    }
}
