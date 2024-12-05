package LOGICA;

public class CrearBus {
    private Bus bus;
    public CrearBus() {
    }

    /**
     * Crea un bus de un piso o dos pisos dependiendo del parametro
     * @param pisos
     * @return
     */
    public Bus crearBus(int pisos) {
        switch (pisos) {
            case 1 -> bus = new BusUnPiso();
            case 2 -> bus = new BusDosPisos();
        }
        return bus;
    }
}