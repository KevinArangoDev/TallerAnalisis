package algoritmosBusqueda;

public class BusquedaBinaria implements MedirBusquedas.Busqueda {
    @Override
    public boolean buscar(int[] arr, int numeroBuscado) {
        int inicio = 0, fin = arr.length - 1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (arr[medio] == numeroBuscado) {
                return true;
            } else if (arr[medio] < numeroBuscado) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return false;
    }
}
