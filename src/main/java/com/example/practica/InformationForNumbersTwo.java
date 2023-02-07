package com.example.practica;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class InformationForNumbersTwo {

    @FXML
    private Button look21;

    @FXML
    private Button look22;

    @FXML
    private Button look23;

    @FXML
    private Button look24;

    @FXML
    private Button next1;

    @FXML
    private ImageView number1;

    @FXML
    private ImageView number2;

    @FXML
    private ImageView number3;

    @FXML
    private ImageView number4;

    @FXML
    private Text text1;

    @FXML
    private Text text2;
    @FXML
    public void initialize() {
        look21.setOnAction(clik -> {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("NumberFive.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
                stage.setTitle("Гостиница");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        look22.setOnAction(clik -> {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("numberSix.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
                stage.setTitle("Гостиница");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        look23.setOnAction(clik -> {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("numberSeven.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
                stage.setTitle("Гостиница");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        look24.setOnAction(clik -> {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("numberEight.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
                stage.setTitle("Гостиница");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        next1.setOnAction(clik -> {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("InformationForNumbers.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
                stage.setTitle("Гостиница");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });


    }

}
