package fes.aragon.vectores.Interfaz;

//package fes.aragon.vectores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

public class CalculadoraController {

    @FXML
    private TextField vector1XField;

    @FXML
    private TextField vector1YField;

    @FXML
    private TextField vector2XField;

    @FXML
    private TextField vector2YField;

    @FXML
    private TextArea resultadoArea;

    @FXML
    private void sumarVectores(ActionEvent event) {
        try {
            // Obtener los valores de los campos
            double x1 = Double.parseDouble(vector1XField.getText());
            double y1 = Double.parseDouble(vector1YField.getText());
            double x2 = Double.parseDouble(vector2XField.getText());
            double y2 = Double.parseDouble(vector2YField.getText());

            // Sumar los vectores
            double resultadoX = x1 + x2;
            double resultadoY = y1 + y2;

            // Mostrar el resultado en el área de texto
            resultadoArea.setText("Vector resultante: (" + resultadoX + ", " + resultadoY + ")");

            // Mostrar gráfica en nueva ventana
            mostrarGrafica(resultadoX, resultadoY);

        } catch (NumberFormatException e) {
            resultadoArea.setText("Por favor, ingrese valores válidos.");
        }
    }

    // Método para mostrar la gráfica del vector resultante
    private void mostrarGrafica(double resultX, double resultY) {
        Stage graphStage = new Stage();
        graphStage.setTitle("Gráfica del Vector Resultante");

        // Crear el canvas para dibujar el vector
        Canvas canvas = new Canvas(400, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Dibujar los ejes
        gc.strokeLine(200, 0, 200, 400); // Eje Y
        gc.strokeLine(0, 200, 400, 200); // Eje X

        // Dibujar el vector resultante, desde el origen (200, 200) con escala
        gc.strokeLine(200, 200, 200 + resultX * 50, 200 - resultY * 50); // Escalamos por 50 para que se vea

        // Configurar la nueva ventana
        VBox layout = new VBox(canvas);
        Scene scene = new Scene(layout, 400, 400);
        graphStage.setScene(scene);
        graphStage.show();
    }
}

