package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Persona gerente1 = new Gerente("Juan", 1, 200_000, 25_000);
        Persona empleado1 = new Empleado("Pedro", 2, 100_000, 30);
        Persona empleado2 = new Empleado("Matias", 3, 100_000, 10);

        empresa.listaPersonas.add(gerente1);
        empresa.listaPersonas.add(empleado1);
        empresa.listaPersonas.add(empleado2);

        System.out.println("Gasto total de salarios: " + empresa.gastoTotalSalarios());
    }
}
