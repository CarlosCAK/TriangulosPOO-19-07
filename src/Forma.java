public abstract class Forma {
    private double area;
    private double perimeto;



    @Override
    public String toString() {
        return "Forma{" +
                "area=" + area +
                ", perimeto=" + perimeto +
                '}';
    }

    abstract void calcularArea();

    abstract void calcularPerimetro();

    public double getArea() {
        return area;
    }

    public double getPerimeto() {
        return perimeto;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeto(double perimeto) {
        this.perimeto = perimeto;
    }
}
