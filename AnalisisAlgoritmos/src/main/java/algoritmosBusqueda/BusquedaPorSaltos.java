package algoritmosBusqueda;

public class BusquedaPorSaltos implements MedirBusquedas.Busqueda {
    @Override
    public boolean buscar(int[] arr, int numeroBuscado) {
        int n = arr.length;
        int salto = (int) Math.sqrt(n);
        int prev = 0;
        while (arr[Math.min(salto, n) - 1] < numeroBuscado) {
            prev = salto;
            salto += (int) Math.sqrt(n);
            if (prev >= n) return false;
        }
        for (int i = prev; i < Math.min(salto, n); i++) {
            if (arr[i] == numeroBuscado) {
                return true;
            }
        }
        return false;
    }
}
