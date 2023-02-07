package com.example.practica;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class InformationForNumbers  {

    @FXML
    private Button look1;

    @FXML
    private Button look2;

    @FXML
    private Button look3;

    @FXML
    private Button look4;

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
    private Button next2;


    @FXML
    public void initialize() {
        look1.setOnAction(clik -> {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("NumberOne.fxml"));
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

        look2.setOnAction(clik -> {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("numberTwo.fxml"));
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

        look3.setOnAction(clik -> {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("numberThree.fxml"));
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

        look4.setOnAction(clik -> {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("numberFor.fxml"));
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
                loader.setLocation(getClass().getResource("InformationForNumbersTwo.fxml"));
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

        next2.setOnAction(clik -> {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("WindowOne.fxml"));
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
