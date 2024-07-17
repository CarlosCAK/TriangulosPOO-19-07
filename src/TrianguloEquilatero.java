public class TrianguloEquilatero extends  Triangulo{


    public TrianguloEquilatero(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
        this.calcularArea();
        this.calcularPerimetro();
    }

    @Override
    public String toString() {
        return "TrianguloEquilatero{" + super.toString() + "\n";
    }

    @Override
    void calcularArea() {
        super.setArea((Math.sqrt(3) / 4 ) * Math.pow(super.getLado1(), 2));
    }

    @Override
    void calcularPerimetro() {
        super.setPerimeto(super.getLado1() * 3);
    }


}
