package POO;

public class Vehiculo {

    // Atributos
    private int num_registro, cantidad_ruedas;
    private String marca, modelo;

    // Constructor
    public Vehiculo(int num_registro, String marca, String modelo, int cantidad_ruedas) {
        this.num_registro = num_registro;
        this.marca = marca;
        this.modelo = modelo;
        this.cantidad_ruedas = cantidad_ruedas;
    }

    // Getters y Setters

    public int getNum_registro() {
        return num_registro;
    }

    public void setNum_registro(int num_registro) {
        this.num_registro = num_registro;
    }

    public int getCantidad_ruedas() {
        return cantidad_ruedas;
    }

    public void setCantidad_ruedas(int cantidad_ruedas) {
        this.cantidad_ruedas = cantidad_ruedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Metodos
    public void estacionar() {
        System.out.println("Estacionando...");
    }
}
