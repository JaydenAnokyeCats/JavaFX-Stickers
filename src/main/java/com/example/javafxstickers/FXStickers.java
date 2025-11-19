package com.example.javafxstickers;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class FXStickers extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Group group = new Group();

        //Design (Putting in Method Later)
        Circle base = new Circle(400.0f,400.0f,300.0f, Color.rgb(251,174,200));
        Ellipse cheekL = new Ellipse(225.0f, 450.0f, 55.0f, 40.0f);
        cheekL.setFill(Color.rgb(249,134,189));
        Ellipse cheekR = new Ellipse(565.0f, 450.0f, 55.0f, 40.0f);
        cheekR.setFill(Color.rgb(249,134,189));

        Stop[] colorChange = new Stop[] { new Stop(0, Color.BLUE), new Stop(1, Color.RED)};
        LinearGradient smallPupilGradient = new LinearGradient(0,0,1,0,true,
                CycleMethod.NO_CYCLE, colorChange);
        Ellipse eyeL = new Ellipse(300.0f, 285.0f, 50.0f, 100.0f);
        eyeL.setFill(Color.BLACK);
        Ellipse eyePupilL = new Ellipse(300.0f, 245.0f, 30.0f, 50.0f);
        eyePupilL.setFill(Color.WHITE);
        Arc eyePupilSmallL = new Arc(300.0,335.0,30.0,40.0,180.0,180.0);
        eyePupilSmallL.setFill(smallPupilGradient);

        Ellipse eyeR = new Ellipse(500.0f, 285.0f, 50.0f, 100.0f);
        eyeR.setFill(Color.BLACK);
        Ellipse eyePupilR = new Ellipse(500.0f, 245.0f, 30.0f, 50.0f);
        eyePupilR.setFill(Color.WHITE);
        Arc eyePupilSmallR = new Arc(500.0,335.0,30.0,40.0,180.0,180.0);
        eyePupilSmallR.setFill(Color.rgb(116,30,30));

        Arc mouth = new Arc(400.0,450.0,80.0,70.0,180.0,180.0);
        mouth.setFill(Color.rgb(116,30,30));
        Arc tongue = new Arc(400.0,455.0,50.0,60.0,180.0,180.0);
        tongue.setFill(Color.rgb(200,72,73));

        group.getChildren().addAll(base, cheekL, cheekR, eyeL, eyePupilL
                , eyePupilSmallL, eyeR, eyePupilR, eyePupilSmallR, mouth, tongue);







        Scene scene = new Scene(group, 900, 900, Color.DARKGREY);
        stage.setScene(scene);
        stage.setTitle("JavaFX Stickers");
        stage.show();


    }
}

