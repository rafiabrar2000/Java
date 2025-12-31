package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxLayout extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button b = new Button("Press");
        b.setPrefWidth(75);
        b.setPrefHeight(75);
        HBox.setMargin(b,new Insets(10));

        Button b2 = new Button("Exit");
        b2.setPrefWidth(75);
        b2.setPrefHeight(75);
        HBox.setMargin(b2,new Insets(10));

        Button b3 = new Button("Save");
        b3.setPrefWidth(75);
        b3.setPrefHeight(75);
        HBox.setMargin(b3,new Insets(10));

        Button b4 = new Button("Load");
        b4.setPrefWidth(75);
        b4.setPrefHeight(75);
        HBox.setMargin(b4,new Insets(10));

        b.setOnAction(
                ae -> {
                    System.out.println("Rafi Abrar Kabir");
                }
        );
        b2.setOnAction(
                ae -> {
                    stage.close();
                    System.out.println("Exited");
                }
        );
        b3.setOnAction(
                ae -> {
                    System.out.println("Save");
                }
        );
        b4.setOnAction(
                ae -> {
                    System.out.println("Loaded");
                }
        );
        stage.setOnCloseRequest(ae->
                {
                    System.out.println("Exited");
                }
        );
        HBox layout = new HBox();
        layout.getChildren().addAll(b,b2,b3,b4);


        Scene scene = new Scene(layout,200,200);
        stage.setScene(scene);
        stage.show();

    }
}
