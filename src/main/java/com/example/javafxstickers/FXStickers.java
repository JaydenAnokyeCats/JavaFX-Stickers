package com.example.javafxstickers;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class FXStickers extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Group group = new Group();

        //Design
        Circle base = new Circle(400.0f,400.0f,300.0f, Color.HOTPINK);
        Ellipse cheekL = new Ellipse();
        group.getChildren().addAll(base);







        Scene scene = new Scene(group, 900, 900, Color.DARKGREY);
        stage.setScene(scene);
        stage.setTitle("JavaFX Stickers");
        stage.show();


    }
}

