package algoritmosOrganizacion;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;

public class GraficoAlgoritmos {
    public static void main(String[] args) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        //dataset.addValue(180, "Burbuja", "10,000");
        dataset.addValue(69, "QuickSort", "100,000");
       // dataset.addValue(83191, "StoogeSort", "10,000");
        dataset.addValue(144, "PigeonholeSort", "100,000");
        dataset.addValue(4, "MergeSort", "100,000");
        dataset.addValue(9, "BitonicSort", "100,000");

        JFreeChart chart = ChartFactory.createBarChart(
                "Tiempos de Ejecución de Algoritmos",
                "Algoritmo",
                "Tiempo (ms)",
                dataset
        );

        // Crear un panel para mostrar el gráfico
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(800, 600));

        // Crear la ventana
        JFrame frame = new JFrame("Gráfico de Algoritmos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(chartPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
