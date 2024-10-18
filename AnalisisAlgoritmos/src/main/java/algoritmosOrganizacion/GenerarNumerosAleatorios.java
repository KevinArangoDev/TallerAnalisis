package algoritmosOrganizacion;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerarNumerosAleatorios {
    public static void generarNumeros(String archivo, int cantidad) {
        Random random = new Random();

        try (BufferedWriter bufferw = new BufferedWriter(new FileWriter(archivo))) {
            for (int i = 0; i < cantidad; i++) {
                int numero = 10000000 + random.nextInt(90000000);
                bufferw.write(Integer.toString(numero));
                bufferw.newLine();
            }
            System.out.println("Se generaron " + cantidad + " números en el archivo: " + archivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
