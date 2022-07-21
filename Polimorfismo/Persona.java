package Polimorfismo;

public abstract class Persona {
    private String nombre;
    private int legajo;
    protected double salario;

    public Persona(String nombre, int legajo, double salario) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.salario = salario;
    }

    public abstract double getSalario();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}