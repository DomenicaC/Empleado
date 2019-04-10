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
 */
public abstract class Empleado {
    
    private int codigo;
    private String nombre;
    private String cedula;
    private Date fechaContratacion;
    private double salario;
    
    public Empleado(){
    
    }

    //constructor
    public Empleado(int codigo, String nombre, String cedula, Date fechaContratacion, double salario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaContratacion = fechaContratacion;
        this.salario = salario;
    }

    //set
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //get
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public double getSalario() {
        return salario;
    }

    //toString
    
    
    public abstract double calcularSalarioFinal();
    /*mas de 5 a;os en la empresa se la un bono de 50 dolares por cadaa;o
    caso cotrario su salario queda como basico
    */
    @Override
    public String toString() {
        return "Empleado{" + "codigo=" + codigo + ", nombre=" + nombre + ", cedula=" + cedula + ", fechaContratacion=" + fechaContratacion + ", salario=" + salario + '}';
    }
}
