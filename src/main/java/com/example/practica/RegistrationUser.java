package com.example.practica;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.*;

public class RegistrationUser {

    @FXML
    private TextField id;

    @FXML
    private ImageView dog2;

    @FXML
    private Button reg;

    @FXML
    private Button reg2;

    @FXML
    private TextField tellnumber;

    @FXML
    private Text text;

    @FXML
    private Button add;

    @FXML
    public void initialize() {
        reg.setOnAction(clik -> {
            try {
                String line=(id.getText());
                FileOutputStream fileOutputStream =new FileOutputStream("C:\\Users\\User\\IdeaProjects\\practica\\src\\main\\resources\\com\\example\\practica\\id");
                byte[] buffer=line.getBytes();
                fileOutputStream.write(buffer);
                System.out.println("Данные сохранены");
            } catch (Exception e) {
                System.out.println("Данные не удалось сохранить");
            }
        });
        reg2.setOnAction(clik -> {
            try {
                String line=(tellnumber.getText());
                FileOutputStream fileOutputStream =new FileOutputStream("C:\\Users\\User\\IdeaProjects\\practica\\src\\main\\resources\\com\\example\\practica\\tellNumber");
                byte[] buffer=line.getBytes();
                fileOutputStream.write(buffer);
                System.out.println("Данные сохранены");
            } catch (Exception e) {
                System.out.println("Данные не удалось сохранить");
            }
        });
        add.setOnAction(clik -> {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("Registration.fxml"));
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


