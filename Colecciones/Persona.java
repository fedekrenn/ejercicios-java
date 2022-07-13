package Colecciones;
import java.util.*;

public class Persona {
    private String nombre, apellido, direccion;
    private int dni, celular, edad;

    // Constructor
    public Persona(String nombre, String apellido, String direccion, int dni, int celular, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.dni = dni;
        this.celular = celular;
        this.edad = edad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getDni() {
        return dni;
    }

    public int getCelular() {
        return celular;
    }

    public int getEdad() {
        return edad;
    }

    // Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static void main(String[] args) {

        // Creación LinkedList
        List<Persona> listaPersonas = new LinkedList<Persona>();

        // Agregar elementos a la lista

        listaPersonas.add(new Persona("Juan", "Perez", "Av. Siempre Viva 123", 111111, 12345678, 11));
        listaPersonas.add(new Persona("Pedro", "Perez", "Av. Siempre Viva 123", 222222, 12345678, 15));
        listaPersonas.add(new Persona("Maria", "Perez", "Av. Siempre Viva 123", 333333, 12345678, 52));
        listaPersonas.add(new Persona("Juana", "Perez", "Av. Siempre Viva 123", 444444, 12345678, 30));
        listaPersonas.add(new Persona("Fede", "Krenn", "Av. Calle falsa 123", 555555, 12345678, 30));
        listaPersonas.add(new Persona("Erica", "Krenn", "Camino Enrique, 5, 16º B", 777777, 12345678, 58));
        listaPersonas.add(new Persona("Juan", "Galindo Tercero", "Av. Siempre Viva 123", 888888, 936406834, 20));
        listaPersonas.add(new Persona("Carolina", "Rodriguez", "Carrer Victoria, 75, 2º E", 9999999, 967070274, 16));
        listaPersonas.add(new Persona("Jesus", "Menchaga", "Carrer Barrientos, 61, 53º B", 000000, 346152469, 34));
        listaPersonas.add(new Persona("Pedro", "Cedillo", "Travessera Jorge, 63, 4º D", 12345678, 953957497, 4));


        List<Persona> listaMayores = new LinkedList<Persona>();
        List<Persona> listaMenores = new LinkedList<Persona>();

        // Agregamos mayores o menores a la nueva lista

        for (Persona persona : listaPersonas) {
            if (persona.getEdad() >= 18) {
                listaMayores.add(persona);
            } else {
                listaMenores.add(persona);
            }
        }

        // Recorremos ambas listas
        System.out.println("\nLista de mayores de edad:");
        for (Persona persona : listaMayores) {
            System.out.println(persona.getNombre() + " " + persona.getApellido() + " " + persona.getEdad());
        }

        System.out.println("\nLista de menores de edad:");
        for (Persona persona : listaMenores) {
            System.out.println(persona.getNombre() + " " + persona.getApellido() + " " + persona.getEdad());
        }


    }

}
