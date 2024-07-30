public class TrianguloEscaleno extends Triangulo{

    private double semiPerimetro;

    public TrianguloEscaleno(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
        this.calcularPerimetro();
        this.calcularSemiPerimetro();
        this.calcularArea();
    }

    @Override
    public String toString() {
        return "TrianguloEscaleno{" +
                super.toString() +
                "semiPerimetro=" + semiPerimetro +
                '}';
    }

    @Override
    void calcularArea() {

        super.setArea(Math.sqrt(this.semiPerimetro*(this.semiPerimetro - super.getLado1())*
                (this.semiPerimetro - super.getLado2())*
                (this.semiPerimetro - super.getLado3())));
    }

    @Override
    void calcularPerimetro() {

        super.setPerimeto(this.getLado1() + this.getLado2() + this.getLado3());
    }
    void calcularSemiPerimetro(){
        this.semiPerimetro = this.getPerimeto() / 2;
    }
}
