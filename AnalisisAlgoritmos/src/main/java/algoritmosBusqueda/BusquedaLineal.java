package algoritmosBusqueda;

public class BusquedaLineal implements MedirBusquedas.Busqueda {
    @Override
    public boolean buscar(int[] arr, int numeroBuscado) {
        for (int num : arr) {
            if (num == numeroBuscado) {
                return true;
            }
        }
        return false;
    }
}
