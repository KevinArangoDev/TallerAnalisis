package algoritmosBusqueda;

import algoritmosOrganizacion.CargarNumeros;
import algoritmosOrganizacion.GenerarNumerosAleatorios;

import java.util.Arrays;
import java.util.Random;

public class MedirBusquedas {

    public static void main(String[] args) {
        String archivo = "src/main/resources/Archivo/numeros.txt";
        int cantidadNumeros = 1000000;
        GenerarNumerosAleatorios.generarNumeros(archivo, cantidadNumeros);
        int[] tamanos = {10000, 100000, 1000000};

        for (int tamano : tamanos) {
            int[] arrOriginal = CargarNumeros.cargar(archivo, tamano);
            Arrays.sort(arrOriginal);

            int numeroBuscado = 99999999;

            System.out.println("Tamaño del arreglo: " + tamano);

            medirTiempo("Búsqueda Lineal", arrOriginal, numeroBuscado, new BusquedaLineal());
            medirTiempo("Búsqueda Lineal Limitada", arrOriginal, numeroBuscado, new BusquedaLinealLimitada());
            medirTiempo("Búsqueda Binaria", arrOriginal, numeroBuscado, new BusquedaBinaria());
            medirTiempo("Búsqueda por Saltos", arrOriginal, numeroBuscado, new BusquedaPorSaltos());
        }
    }

    public static void medirTiempo(String nombreAlgoritmo, int[] arr, int numeroBuscado, Busqueda algoritmo) {
        long inicio = System.nanoTime();
        boolean encontrado = algoritmo.buscar(arr, numeroBuscado);
        long fin = System.nanoTime();
        long duracion = (fin - inicio) / 1000000;
        System.out.println(nombreAlgoritmo + ": " + duracion + " ms");
    }
    public static int[] generarArregloAleatorio(int tamano) {
        Random random = new Random();
        int[] arreglo = new int[tamano];
        for (int i = 0; i < tamano; i++) {
            arreglo[i] = 10000000 + random.nextInt(90000000);
        }
        return arreglo;
    }

    @FunctionalInterface
    public interface Busqueda {
        boolean buscar(int[] arr, int numeroBuscado);
    }
}

