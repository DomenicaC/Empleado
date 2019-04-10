/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;

/**
 *
 * @author Domenica Cañizares
 * 
 * 
 * si hace ventas entre 500 y 1000 dolares comision de 10% sobre las ventas totales
 * si hace ventas entre 1001 y 5000 dolares comision de 15% sobre las ventas totales
 * si hace ventas superiores a 5000 dolares comision de 20% sobre las ventas totales
 */
public class EmpleadoPorComision extends Empleado{

    private double ventasMensuales;

    public EmpleadoPorComision() {
    }

    public EmpleadoPorComision(double ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }

    public EmpleadoPorComision(double ventasMensuales, int codigo, String cedula, String nombre, Date fechaContratacion, double salario) {
        super(codigo, cedula, nombre, fechaContratacion, salario);
        this.ventasMensuales = ventasMensuales;
    }

    public EmpleadoPorComision(int codigo, String cedula, String nombre, Date fechaContratacion, double salario) {
        super(codigo, cedula, nombre, fechaContratacion, salario);
    }

    public double getVentasMensuales() {
        return ventasMensuales;
    }

    public void setVentasMensuales(double ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }

    @Override
    public double calcularSalarioFinal() {
        if (ventasMensuales >= 500 && ventasMensuales <= 1000) {
            return super.getSalario() + (ventasMensuales * 0.10);
        } else if (ventasMensuales > 1000 && ventasMensuales <= 5000) {
            return super.getSalario() + (ventasMensuales * 0.15);
        } else if (ventasMensuales > 5000) {
            return super.getSalario() + (ventasMensuales * 0.20);
        } else {
            return super.getSalario();
        }
    }

    @Override
    public String toString() {
        return super.toString()+"EmpleadoPorComision{SalarioFinal = " + this.calcularSalarioFinal()+'}';
    }
}
