package Polimorfismo;

public class Empleado extends Persona {

    private int horasExtraTrabajadas;
    private final static double SALARIO_POR_HORA_EXTRA = 1000;

    public Empleado(String nombre, int legajo, double salario, int horasExtraTrabajadas) {
        super(nombre, legajo, salario);
        this.horasExtraTrabajadas = horasExtraTrabajadas;
    }

    @Override
    public double getSalario() {
        return super.salario + (horasExtraTrabajadas * SALARIO_POR_HORA_EXTRA);
    }
}