package com.example.javafxstickers;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class FXStickersChallenge extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Group group = new Group();

        //Design
        Rectangle base = new Rectangle(150, 150, 600, 600);
        base.setFill(Color.DARKRED);

        Polygon extrudingTri1 = new Polygon(50.0,50.0,330.0,240.0,250.0,300.0);
        Polygon extrudingTri2 = new Polygon(850.0,50.0,650.0,320.0,570.0,300.0);
        Polygon extrudingTri3 = new Polygon(50.0,650.0,330.0,240.0,250.0,300.0);
        Polygon extrudingTri4 = new Polygon(850.0,850.0,530.0,740.0,450.0,300.0);
        group.getChildren().addAll(base, extrudingTri1,extrudingTri2,extrudingTri3,extrudingTri4);

        // Top-right triangle
//        Polygon extrudingTri2 = new Polygon(
//                750.0, 150.0,
//                800.0, 100.0,
//                750.0, 100.0
//        );
//
//        // Bottom-right triangle
//        Polygon extrudingTri3 = new Polygon(
//                750.0, 750.0,
//                800.0, 800.0,
//                750.0, 800.0
//        );
//
//        // Bottom-left triangle
//        Polygon extrudingTri4 = new Polygon(
//                150.0, 750.0,
//                100.0, 800.0,
//                150.0, 800.0
//        );
//



        Scene scene = new Scene(group, 900, 900, Color.DARKGREY);
        stage.setScene(scene);
        stage.setTitle("JavaFX Stickers");
        stage.show();


    }
}
