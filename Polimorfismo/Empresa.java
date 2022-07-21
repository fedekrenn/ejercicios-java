package Polimorfismo;

import java.util.LinkedList;
import java.util.List;

public class Empresa {
    public List<Persona> listaPersonas = new LinkedList<>();

    public List<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public double gastoTotalSalarios() {
        double gastoTotal = 0;
        for (Persona persona : listaPersonas) {
            gastoTotal += persona.getSalario();
        }
        return gastoTotal;
    }
}