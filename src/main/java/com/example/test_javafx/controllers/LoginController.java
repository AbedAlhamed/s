package com.example.test_javafx.controllers;

import com.example.test_javafx.Navigation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class LoginController {
    @FXML
    public AnchorPane rootPane;
    Navigation navigation = new Navigation();
    public void dirictor(ActionEvent actionEvent) {
    }

    public void te(ActionEvent actionEvent) {
        navigation.navigateTo(rootPane,navigation.TEACHER_FXML);
    }

    public void login(ActionEvent actionEvent) {
    }
}
