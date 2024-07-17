public class Retangulo extends Forma {
    private double lado1;
    private double lado2;

    public Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.calcularArea();
        this.calcularPerimetro();
    }

    @Override
    void calcularArea() {
        super.setArea(this.lado1 * this.lado2);
    }

    @Override
    void calcularPerimetro() {
        super.setPerimeto(2 * (this.lado1 + this.lado2));
    }
}
