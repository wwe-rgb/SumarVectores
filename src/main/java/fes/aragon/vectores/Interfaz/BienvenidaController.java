package fes.aragon.vectores.Interfaz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class BienvenidaController {
    @FXML
    private Button Btmvec;

    @FXML
    private ImageView Image2;

    @FXML
    private ImageView Imagen1;

    public void iniciarCalculadora(ActionEvent event) {
        try {
            //FXMLLoader loader = new FXMLLoader(getClass().getResource("/fes/aragon/vectores/calculadora.fxml"));
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fes/aragon/vectores/calculadora.fxml"));

            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Calculadora");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void aprenderVectores(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fes/aragon/vectores/aprendervec.fxml"));

            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Aprender vectores");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


