package Domain;

    public class Empleado {
        private int dni;
        private String nombre;
        private String apellido;
        private double salario;

        public Empleado(int dni, String nombre, String apellido, double salario) {
            this.dni = dni;
            this.nombre = nombre;
            this.apellido = apellido;
            this.salario = salario;
        }

        public int getDni() {
            return dni;
        }

        public void setDni(int dni) {
            this.dni = dni;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public double salarioAnual(){
            double salarioAnual= (this.salario*12);
            return salarioAnual;
        }

        public void aumentarSalario(double porcentaje){
            this.salario=salario + ((salario)*(porcentaje/100));
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Empleado[");
            sb.append("dni=").append(dni);
            sb.append(", nombre='").append(nombre).append('\'');
            sb.append(", apellido='").append(apellido).append('\'');
            sb.append(", salario= $").append(salario);
            sb.append(']');
            return sb.toString();
        }
    }


