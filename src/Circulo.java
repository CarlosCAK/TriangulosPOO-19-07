public class Circulo extends  Forma{
    private double raio;
    private double diametro = raio * 2;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    void calcularArea() {
        super.setArea(3.14 * Math.pow(raio,2));
    }

    @Override
    void calcularPerimetro() {
        super.setPerimeto(3.14 * (2 * this.raio));
    }

    public double getRaio() {
        return raio;
    }

    public double getDiametro() {
        return diametro;
    }

}
