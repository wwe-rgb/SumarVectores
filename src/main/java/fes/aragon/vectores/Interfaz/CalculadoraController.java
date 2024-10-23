package fes.aragon.vectores.Interfaz;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CalculadoraController {

    @FXML
    private Button btnCalcular;

    @FXML
    private TextField entradaDireccion1;

    @FXML
    private TextField entradaMagnitud1;

    @FXML
    private TextField entradaMagnitud2;

    @FXML
    private TextField entradaDireccion2;

    @FXML
    private TextArea salidaDireccion;

    @FXML
    private TextArea salidaMagnitud;

    public void calcular(javafx.event.ActionEvent actionEvent) {
        try {
            // Obtener los valores de entrada
            double magnitudVectorA = Double.parseDouble(entradaMagnitud1.getText());
            double anguloA = Double.parseDouble(entradaDireccion1.getText());
            double magnitudVectorB = Double.parseDouble(entradaMagnitud2.getText());
            double anguloB = Double.parseDouble(entradaDireccion2.getText());

            // Convertir ángulos a radianes
            double radianesA = Math.toRadians(anguloA);
            double radianesB = Math.toRadians(anguloB);

            // Calcular componentes de los vectores A y B
            double Ax = magnitudVectorA * Math.cos(radianesA);
            double Ay = magnitudVectorA * Math.sin(radianesA);

            double Bx = magnitudVectorB * Math.cos(radianesB);
            double By = magnitudVectorB * Math.sin(radianesB);

            // Calcular el vector resultante
            double Rx = Ax + Bx;
            double Ry = Ay + By;

            // Calcular la magnitud y dirección del vector resultante
            double magnitudResultante = Math.sqrt((Rx * Rx) + (Ry * Ry));
            double anguloResultante = Math.toDegrees(Math.atan2(Ry, Rx));

            // Mostrar los resultados en los TextArea
            salidaMagnitud.setText(String.format("Magnitud Resultante: %.2f", magnitudResultante));
            salidaDireccion.setText(String.format("Direccion Resultante: %.2f°", anguloResultante));

            // Llamar a la función que dibuja el vector resultante
            mostrarGrafica(Rx, Ry);

        } catch (NumberFormatException e) {
            salidaMagnitud.setText("Error: Entrada no válida.");
            salidaDireccion.setText("Error: Entrada no válida.");
        }
    }

    // Método para mostrar la gráfica del vector
    private void mostrarGrafica(double resultX, double resultY) {
        Stage graphStage = new Stage();
        graphStage.setTitle("Gráfica del Vector Resultante");

        // Crear el canvas para dibujar el vector
        Canvas canvas = new Canvas(400, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Dibujar los ejes (X e Y)
        gc.setStroke(Color.BLACK);
        gc.strokeLine(200, 0, 200, 400); // Eje Y
        gc.strokeLine(0, 200, 400, 200); // Eje X

        // Configuración para dibujar el vector resultante
        gc.setStroke(Color.RED);
        gc.strokeLine(200, 200, 200 + resultX * 50, 200 - resultY * 50); // Escala por 50 para mayor visibilidad

        // Configurar la nueva ventana y mostrarla
        VBox layout = new VBox(canvas);
        Scene scene = new Scene(layout, 400, 400);
        graphStage.setScene(scene);
        graphStage.show();
    }
}
