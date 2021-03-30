package Domain;

public class ItemDeVenta {
    private int identificador;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    public ItemDeVenta() {
    }

    public ItemDeVenta(int identificador, String descripcion, int cantidad, double precioUnitario) {
        this.identificador = identificador;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double precioTotal(){
        double total= (this.cantidad*this.precioUnitario);
        return total;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Item Venta");
        sb.append("\nIdentificador= ").append(identificador);
        sb.append("\nDescripcion= '").append(descripcion).append('\'');
        sb.append("\nCantidad= ").append(cantidad);
        sb.append("\nPrecioUnitario= $").append(precioUnitario);
        return sb.toString();
    }
}
