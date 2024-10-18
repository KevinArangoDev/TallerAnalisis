package algoritmosOrganizacion;

public class Bitonic {

    public void sort(int[] arr, int low, int cnt, boolean dir) {
        if (cnt > 1) {
            int k = cnt / 2;
            //RECURSIVIDAD
            sort(arr, low, k, true);
            sort(arr, low + k, k, false);
            bitonicMerge(arr, low, cnt, dir);
        }
    }

    private void bitonicMerge(int[] arr, int low, int cnt, boolean dir) {
        if (cnt > 1) {
            int k = cnt / 2;
            for (int i = low; i < low + k; i++) {
                if ((dir && arr[i] > arr[i + k]) || (!dir && arr[i] < arr[i + k])) {
                    int temp = arr[i];
                    arr[i] = arr[i + k];
                    arr[i + k] = temp;
                }
            }
            // Llamada recursiva para fusionar las mitades
            bitonicMerge(arr, low, k, dir);
            bitonicMerge(arr, low + k, k, dir);
        }
    }
}
