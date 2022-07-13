package Colecciones;

import java.util.*;

public class Autos {
    private int num_patente;
    private String marca, modelo, color, chasis;

    // Constructor
    public Autos(int num_patente, String marca, String modelo, String color, String chasis) {
        this.num_patente = num_patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.chasis = chasis;
    }

    // Getters
    public int getNum_patente() {
        return num_patente;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getChasis() {
        return chasis;
    }

    // Setters

    public void setNum_patente(int num_patente) {
        this.num_patente = num_patente;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public static void main(String[] args) {

        // Stack
        Stack<Autos> pilaAutos = new Stack<Autos>();

        pilaAutos.push(new Autos(1, "Ford", "Mustang", "Rojo", "ABC123"));
        pilaAutos.push(new Autos(2, "Chevrolet", "Camaro", "Azul", "DEF456"));
        pilaAutos.push(new Autos(3, "Fiat", "Punto", "Blanco", "GHI789"));
        pilaAutos.push(new Autos(4, "Peugeot", "207", "Rojo", "JKL012"));
        pilaAutos.push(new Autos(5, "Volwkswagen", "Gol", "Azul", "MNO345"));
        pilaAutos.push(new Autos(6, "Honda", "Civic", "Blanco", "PQR678"));
        pilaAutos.push(new Autos(7, "Chevrolet", "Mazda", "Rojo", "STU901"));

        // Buscar un auto de color rojo
        System.out.println("\nBuscar autos de color rojo: ");
        for (Autos pil : pilaAutos) {
            if (pil.getColor().equals("Rojo")) {
                System.out.println("Patente: " + pil.getNum_patente() + ", Marca: " + pil.getMarca() + ", Modelo: "
                        + pil.getModelo() + ", Color: " + pil.getColor() + ", Chasis: " + pil.getChasis());
            }
        }

        // Mostramos el auto que está en la cima de la pila
        System.out.println("\nAuto en la cima de la pila: ");
        System.out.println("Patente: " + pilaAutos.peek().getNum_patente() + ", Marca: " + pilaAutos.peek().getMarca()
                + ", Modelo: " + pilaAutos.peek().getModelo() + ", Chasis: " + pilaAutos.peek().getChasis());

        // Borramos el auto por encima de la pila
        System.out.println("\nBorramos el auto en la cima de la pila: ");
        pilaAutos.pop();

        // Agregamos 2 autos nuevos
        System.out.println("\nAgregamos 2 autos nuevos: ");
        pilaAutos.push(new Autos(8, "Peugeot", "3008", "Rojo", "STU901"));
        pilaAutos.push(new Autos(9, "Fiat", "Cubo", "Azul", "MNO345"));

        // Mostramos los autos de la pila
        System.out.println("\nAutos de la pila: ");
        for (Autos pil : pilaAutos) {
            System.out.println("Patente: " + pil.getNum_patente() + ", Marca: " + pil.getMarca() + ", Modelo: "
                    + pil.getModelo() + ", Color: " + pil.getColor() + ", Chasis: " + pil.getChasis());
        }
    }
}
