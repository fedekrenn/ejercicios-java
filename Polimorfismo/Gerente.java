package Polimorfismo;

import java.util.LinkedList;
import java.util.List;

public class Gerente extends Persona {
    private double salarioExtra;
    private List<Empleado> personalACargo;

    public Gerente(String nombre, int legajo, double salario, double salarioExtra) {
        super(nombre, legajo, salario);
        this.salarioExtra = salarioExtra;
        this.personalACargo = new LinkedList<>();
    }

    public List<Empleado> getPersonalACargo() {
        return personalACargo;
    }

    @Override
    public double getSalario() {
        return super.salario + salarioExtra;
    }
}