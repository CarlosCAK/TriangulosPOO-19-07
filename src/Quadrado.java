public class Quadrado extends Forma{

    private double lado;


    public Quadrado(double lado) {
        this.lado = lado;
        this.calcularArea();
        this.calcularPerimetro();
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                super.toString()+
                "lado=" + lado +
                '}';
    }

    @Override
    void calcularArea() {
        super.setArea(this.lado*this.lado);
    }

    @Override
    void calcularPerimetro() {
        super.setPerimeto(this.lado * 4 );
    }
}
