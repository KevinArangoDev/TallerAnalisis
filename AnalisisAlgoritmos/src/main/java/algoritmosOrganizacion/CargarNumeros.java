package algoritmosOrganizacion;

import java.util.Arrays;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CargarNumeros {

    public static int[] cargar(String archivo, int cantidad) {
        List<Integer> numeros = new ArrayList<>();
        try (BufferedReader buferr = new BufferedReader(new FileReader(archivo))) {
            String linea;
            int contador = 0;
            while ((linea = buferr.readLine()) != null && contador < cantidad) {
                numeros.add(Integer.parseInt(linea));
                contador++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[] arr = new int[numeros.size()];
        for (int i = 0; i < numeros.size(); i++) {
            arr[i] = numeros.get(i);
        }
        return arr;
    }
}