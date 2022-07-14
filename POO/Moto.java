package POO;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(int num_registro, String marca, String modelo, int cantidad_ruedas, int cilindrada) {
        super(num_registro, marca, modelo, cantidad_ruedas);
        this.cilindrada = cilindrada;
    }

    // Getters y Setters

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    
}
