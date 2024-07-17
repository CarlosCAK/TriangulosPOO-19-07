public class Quadrado extends Forma{

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    void calcularArea() {
        super.setArea(lado*lado);
    }

    @Override
    void calcularPerimetro() {
        super.setPerimeto(lado * 4 );
    }
}
