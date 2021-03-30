package Domain;

public class Rectangulo {
    private double ancho=1.0;
    private double alto=1.0;

    public Rectangulo() {
    }

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return this.ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return this.alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double calcularArea(){
        double area=this.alto*this.ancho;
        return area;
    }

    public double calcularPerimetro(){
        double perimetro= ((this.alto*2)+(this.ancho*2));
        return perimetro;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rectangulo");
        sb.append("\nAncho=").append(ancho);
        sb.append("\nAlto=").append(alto);
        return sb.toString();
    }
}
