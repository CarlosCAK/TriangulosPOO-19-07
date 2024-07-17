public class TrianguloIsoceles extends Triangulo{
    private double ladoDiferente;
    private double ladoIgual;
    private double altura;

    public TrianguloIsoceles(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
        this.definirLados();
        this.calcularPerimetro();
        this.calcularAltura();
        this.calcularArea();
    }

    @Override
    public String toString() {
        return "TrianguloIsoceles{" +
                super.toString() +
                "ladoDiferente=" + ladoDiferente +
                ", ladoIgual=" + ladoIgual +
                ", altura=" + altura +
                '}';
    }

    void definirLados(){
        if(super.getLado1() == super.getLado2() && super.getLado1() != super.getLado3()){
            this.ladoDiferente = super.getLado3();
            this.ladoIgual = super.getLado1();
        }
        else if(super.getLado1() == super.getLado3() && super.getLado1() != super.getLado2()){
            this.ladoDiferente = super.getLado2();
            this.ladoIgual = super.getLado1();
        }
        else if(super.getLado3() == super.getLado2() && super.getLado3() != super.getLado1()){
            this.ladoDiferente = super.getLado1();
            this.ladoIgual = super.getLado3();
        }

    }

    @Override
    void calcularArea() {
        super.setArea((this.ladoDiferente * this.altura) / 2);
    }

    @Override
    void calcularPerimetro() {
        super.setPerimeto(ladoDiferente + (2 * ladoIgual));
    }
    void calcularAltura(){
        this.altura = Math.sqrt(Math.pow(ladoIgual, 2) - (Math.pow(ladoDiferente, 2) / 4));
    }

    public double getLadoDiferente() {
        return ladoDiferente;
    }

    public double getLadoIgual() {
        return ladoIgual;
    }

    public double getAltura() {
        return altura;
    }
}
