package algoritmosOrganizacion;

public class Pigeonhole {
    public  void sort(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        int range = max - min + 1;
        int[] holes = new int[range];

        for (int i = 0; i < arr.length; i++) {
            holes[arr[i] - min]++;
        }

        int index = 0;
        for (int i = 0; i < range; i++) {
            while (holes[i]-- > 0) {
                arr[index++] = i + min;
            }
        }
    }
}

