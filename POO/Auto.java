package POO;

public class Auto extends Vehiculo {

    // Atributos
    private int id, cantidad_puertas;
    private String patente, color;
    private boolean caja_manual;

    // Constructor
    public Auto(int num_registro, String marca, String modelo, int cantidad_ruedas, int id, String patente,
            String color, boolean caja_manual, int cantidad_puertas) {
        super(num_registro, marca, modelo, cantidad_ruedas);
        this.id = id;
        this.patente = patente;
        this.color = color;
        this.cantidad_puertas = cantidad_puertas;
        this.caja_manual = caja_manual;
    }

    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad_puertas() {
        return cantidad_puertas;
    }

    public void setCantidad_puertas(int cantidad_puertas) {
        this.cantidad_puertas = cantidad_puertas;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCaja_manual() {
        return caja_manual;
    }

    public void setCaja_manual(boolean caja_manual) {
        this.caja_manual = caja_manual;
    }

    // Funcionamiento del auto
    public void encender() {
        System.out.println("El auto esta encendido");
    }

    public void apagar() {
        System.out.println("El auto esta apagado");
    }

    public void acelerar(Double km) {
        System.out.println("El auto acelera a " + km + " km/h");
    }

    public void frenar(Double km) {
        System.out.println("El auto frena a " + km + " km/h");
    }
}
