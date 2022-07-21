package POO;

public class Camion extends Vehiculo{
    
    // Atributos
    private int cant_ejes;
    private boolean acoplado;

    // Constructor
    public Camion(int num_registro, String marca, String modelo, int cantidad_ruedas, int cant_ejes, boolean acoplado) {
        super(num_registro, marca, modelo, cantidad_ruedas);
        this.cant_ejes = cant_ejes;
        this.acoplado = acoplado;
    }

    // Getters y Setters

    public int getCant_ejes() {
        return cant_ejes;
    }

    public void setCant_ejes(int cant_ejes) {
        this.cant_ejes = cant_ejes;
    }

    public boolean isAcoplado() {
        return acoplado;
    }

    public void setAcoplado(boolean acoplado) {
        this.acoplado = acoplado;
    }

    // Metodos

    public void descargar() {
        System.out.println("Hemos dejado la carga...");
    }
}
