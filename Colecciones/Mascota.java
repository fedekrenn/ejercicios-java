package Colecciones;
import java.util.*;

public class Mascota {
    private String nombre, especie, sexo, color, pelaje, raza;

    // Constructor
    public Mascota( String nombre, String especie, String sexo, String color, String pelaje, String raza ) {
        this.nombre = nombre;
        this.especie = especie;
        this.sexo = sexo;
        this.color = color;
        this.pelaje = pelaje;
        this.raza = raza;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }
    public String getEspecie() {
        return especie;
    }
    public String getSexo() {
        return sexo;
    }
    public String getColor() {
        return color;
    }
    public String getPelaje() {
        return pelaje;
    }
    public String getRaza() {
        return raza;
    }

    // Setters
    public void setNombre( String nombre ) {
        this.nombre = nombre;
    }
    public void setEspecie( String especie ) {
        this.especie = especie;
    }
    public void setSexo( String sexo ) {
        this.sexo = sexo;
    }
    public void setColor( String color ) {
        this.color = color;
    }
    public void setPelaje( String pelaje ) {
        this.pelaje = pelaje;
    }
    public void setRaza( String raza ) {
        this.raza = raza;
    }

    public static void main(String[] args) {
        // ArrayList
    List <Mascota> listaMascotas = new ArrayList<Mascota> ();

        listaMascotas.add(new Mascota("Buluca", "Perro", "Hembra", "Gris", "Corto", "Pichichu"));
        listaMascotas.add(new Mascota("Rayita", "Gato", "Hembra", "Blanco", "Corto", "Miau1"));
        listaMascotas.add(new Mascota("Gato Pato", "Gato", "Macho", "Gris", "Corto", "Miau2"));
        listaMascotas.add(new Mascota("Dudu", "Perro", "Hembra", "Marron", "Corto", "Salchicha"));

        System.out.println("\nLista de Mascotas: ");
        for (Mascota mascota : listaMascotas) {
            System.out.println("Nombre: " + mascota.getNombre() + ", Especie: " + mascota.getEspecie() + ", Pelaje: " + mascota.getPelaje());
        }


        System.out.println("\nVamos a cambiar el nombre a las primeras 2 mascotas: ");
        listaMascotas.get(0).setNombre("Lubuca");
        listaMascotas.get(1).setNombre("Yarita");

        for (Mascota mascota : listaMascotas) {
            System.out.println("Nombre: " + mascota.getNombre() + ", Especie: " + mascota.getEspecie() + ", Pelaje: " + mascota.getPelaje());
        }

        listaMascotas.add(new Mascota("Vaca", "Perro", "Hembra", "Blanca y negra", "Largo", "Vaca"));
        listaMascotas.add(new Mascota("Oliver", "Gusano", "Macho", "Verde", "N/A", "común"));

        System.out.println("\nSe agregaron 2 nuevas mascotas! ");
        // Mostrar solo si es perro

        System.out.println("\nMostraremos sólo los perros");

        for (Mascota mascota : listaMascotas) {
            if (mascota.getEspecie().equals("Perro")) {
                System.out.println("Nombre: " + mascota.getNombre() + ", Especie: " + mascota.getEspecie() + ", Pelaje: " + mascota.getPelaje());
            }
        }
    }



    

      
}
