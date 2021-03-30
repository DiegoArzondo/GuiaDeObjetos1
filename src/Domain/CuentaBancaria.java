package Domain;

public class CuentaBancaria {
    private int idCuenta;
    private String nombre;
    private double balance;

    public CuentaBancaria(int idCuenta, String nombre, double balance) {
        this.idCuenta = idCuenta;
        this.nombre = nombre;
        this.balance = balance;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double credito(double deposito){
        this.balance = this.balance + deposito;
        return this.balance;
    }

    public double debito(double extraccion){
        if (this.balance< extraccion){
            System.out.println("El dinero es insuficiente");
        }
        else {
            this.balance = this.balance - extraccion;
        }
        return this.balance;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CuentaBancaria:");
        sb.append("\nID Cuenta=").append(idCuenta);
        sb.append("\nNombre='").append(nombre).append('\'');
        sb.append("\nBalance=").append(balance);
        return sb.toString();
    }

}
