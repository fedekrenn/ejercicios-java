package POO;

public class EjemploPOO {
    public static void main(String[] args) {
        Auto auto1 = new Auto(1, "Ford", "Mustang", 4, 1, "AAA-111", "Rojo", true, 4);
        Auto auto2 = new Auto(2, "Chevrolet", "Camaro", 4, 2, "BBB-222", "Azul", false, 2);
        Moto moto1 = new Moto(2, "Yamaha", "YZF-R6", 2, 1200);
        Camion camion1 = new Camion(3, "Scania", "Scania R", 4, 4, true);

        Vehiculo vector[] = new Vehiculo[4];
        vector[0] = auto1;
        vector[1] = auto2;
        vector[2] = moto1;
        vector[3] = camion1;

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Vehiculo " + (i + 1) + ": " + vector[i].getModelo());
        }

        auto1.estacionar();
        camion1.estacionar();
        camion1.descargar();
    }
}