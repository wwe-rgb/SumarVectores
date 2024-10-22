module fes.aragon.vectores {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens fes.aragon.vectores to javafx.fxml;
    exports fes.aragon.vectores.Interfaz;
    opens fes.aragon.vectores.Interfaz to javafx.fxml;
}