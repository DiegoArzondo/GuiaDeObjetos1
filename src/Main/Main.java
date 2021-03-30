package Main;

import Domain.*;
public class Main {
    public static void main(String[] args) {

        //ENUNCIADO1

        Rectangulo nuevo = new Rectangulo();
        System.out.println(nuevo);
        System.out.println("Area: " + nuevo.calcularArea());
        System.out.println("Perimetro: " + nuevo.calcularPerimetro());
        Rectangulo nuevo1= new Rectangulo(4,6);
        System.out.println(nuevo1);
        System.out.println("Area: " + nuevo1.calcularArea());
        System.out.println("Perimetro: " + nuevo1.calcularPerimetro());

        //ENUNCIADO 2

        Empleado empleado1 = new Empleado(23456345,"Carlos","Guitierrez",25000);
        Empleado empleado2 = new Empleado(34234123,"Ana", "Sanchez", 27500);
        System.out.println(empleado1);
        System.out.println(empleado2);
        empleado1.aumentarSalario(15);
        System.out.println(empleado1);
        System.out.println("El salario anual de: "+ empleado1.getNombre() + " es $" + empleado1.salarioAnual());

        //ENUNCIADO 3

        ItemDeVenta nuevoItem= new ItemDeVenta(45,"Calefactor", 50,500);
        System.out.println(nuevoItem);
        System.out.println("El precio total de " + nuevoItem.getDescripcion() + " es $" + nuevoItem.precioTotal());

        //ENUNCIADO 4

        CuentaBancaria cuenta = new CuentaBancaria(8978,"Diego",15000);
        System.out.println(cuenta);
        cuenta.credito(2500);
        System.out.println(cuenta);
        cuenta.debito(1500);
        System.out.println(cuenta);
        cuenta.debito(30000);
        System.out.println(cuenta);

        //ENUNCIADO 5

        Hora reloj= new Hora();
        reloj.iniciarReloj();
        System.out.println(reloj);
        reloj.avanzarUnSegundo(reloj);
        System.out.println(reloj);
    }
}


