package algoritmosBusqueda;

public class BusquedaLinealLimitada implements MedirBusquedas.Busqueda {
    @Override
    public boolean buscar(int[] arr, int numeroBuscado) {
        int limite = Math.min(1000, arr.length);
        for (int i = 0; i < limite; i++) {
            if (arr[i] == numeroBuscado) {
                return true;
            }
        }
        return false;
    }
}
