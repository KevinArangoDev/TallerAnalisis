module com.example.analisisalgoritmos {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jfree.jfreechart;
    requires java.desktop;


    opens algoritmosOrganizacion to javafx.fxml;
    exports algoritmosOrganizacion;
}