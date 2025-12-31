package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button b = new Button("Press");
        b.setOnAction(
                ae -> {
                    System.out.println("Rafi Abrar Kabir");
                }
        );
        stage.setOnCloseRequest(ae->
                {
                    System.out.println("Exited");
                }
        );
        StackPane layout = new StackPane();
        layout.getChildren().add(b);
        Scene scene = new Scene(layout,300,300);
        stage.setScene(scene);
        stage.show();

    }
}


