package fes.aragon.vectores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventObject;

public class AprenderVec {
    @FXML
    private TextArea miTextArea;
    private EventObject event;

    // Método que se ejecuta cuando el controlador se inicializa
    @FXML
    public void initialize() {
        // Aquí puedes configurar valores iniciales si es necesario
        System.out.println("Controlador inicializado.");
    }

    // Método vinculado al evento "onDragDetected" en el TextArea
    @FXML
    private void miTextA() {
        // Puedes manejar el evento de arrastre aquí
        System.out.println("Evento de arrastre detectado en TextArea.");
    }



    public void cerrarVentana(ActionEvent actionEvent) {

            // Obtener la ventana actual y cerrarla
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.close();
        }
    }

