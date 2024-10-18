package algoritmosOrganizacion;

import java.util.Arrays;

public class MedirAlgoritmos {

    public static void main(String[] args) {
        String archivo = "src/main/resources/Archivo/numeros.txt";

        int cantidadNumeros = 1000000;
        GenerarNumerosAleatorios.generarNumeros(archivo, cantidadNumeros);

        int[] tamanos = {10000, 100000, 1000000};

        for (int tamano : tamanos) {
            int[] arrayOriginal = CargarNumeros.cargar(archivo, tamano);
            System.out.println("Tamaño del arreglo: " + tamano);
            medirTiempo("Burbuja", Arrays.copyOf(arrayOriginal, arrayOriginal.length), () -> new Burbuja().sort(arrayOriginal));
            medirTiempo("Pigeonhole", Arrays.copyOf(arrayOriginal, arrayOriginal.length), () -> new Pigeonhole().sort(arrayOriginal));
           // medirTiempo("QuickSort", Arrays.copyOf(arrayOriginal, arrayOriginal.length),
             //       () -> new Quick().sort(arrayOriginal, 0, arrayOriginal.length - 1)); // QuickSort con índices
            medirTiempo("MergeSort", Arrays.copyOf(arrayOriginal, arrayOriginal.length), () -> new Merge().sort(arrayOriginal, 0, arrayOriginal.length - 1));
            medirTiempo("BitonicSort", Arrays.copyOf(arrayOriginal, arrayOriginal.length),
                    () -> new Bitonic().sort(arrayOriginal, 0, arrayOriginal.length, true));
        }
    }

    public static void medirTiempo(String nombreAlgoritmo, int[] arr, Runnable algoritmo) {
        long inicio = System.currentTimeMillis();
        algoritmo.run();
        long fin = System.currentTimeMillis();
        System.out.println(nombreAlgoritmo + ": " + (fin - inicio) + " ms");
    }
}
