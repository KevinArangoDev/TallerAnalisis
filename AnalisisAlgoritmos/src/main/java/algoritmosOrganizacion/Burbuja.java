package algoritmosOrganizacion;

public class Burbuja {
    public void sort(int[] arr) {
        int numerosky = arr.length;
        for (int i = 0; i < numerosky - 1; i++) {
            for (int j = 0; j < numerosky - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}