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


        drawSticker(150.0,100.0,Color.rgb(251,174,200),Color.rgb(173, 65, 101),
                Color.rgb(249,134,189), group);
        drawSticker(356.0,100.0,Color.rgb(251,174,200),Color.rgb(173, 65, 101),
                Color.rgb(249,134,189), group);
        drawSticker(556.0,100.0,Color.rgb(251,174,200),Color.rgb(173, 65, 101),
                Color.rgb(249,134,189), group);
        drawSticker(756.0,100.0,Color.rgb(251,174,200),Color.rgb(173, 65, 101),
                Color.rgb(249,134,189), group);


        Scene scene = new Scene(group, 900, 700, Color.DARKGREY);
        stage.setScene(scene);
        stage.setTitle("JavaFX Stickers");
        stage.show();


    }

    public void drawSticker(double x, double y, Color bodyColor, Color outLineColor, Color cheekColor, Group group){
        Circle base = new Circle(x, y, 75.0, bodyColor);
        // Color.rgb(251,174,200);
         base.setStrokeWidth(5.0);
         base.setStroke(outLineColor);
        // base.setStroke(Color.rgb(173, 65, 101));

        // Features that are unchanging are because they are intended to stay static. When calling, only the x and y
        // parameters effect them
        // Cheeks (unchanging)
         Ellipse cheekL = new Ellipse(56.25 + x, 112.5 + y, 13.75, 10.0);
         cheekL.setFill(cheekColor);
        // cheekL.setFill(Color.rgb(249,134,189));
         Ellipse cheekR = new Ellipse(141.25 + x, 112.5 + y, 13.75, 10.0);
         cheekR.setFill(cheekColor);

        // Eye Pupil Gradient (unchanging)
        LinearGradient smallPupilGradient = getLinearGradient();

        // Eyes and Pupils (unchanging)
        // Left Eye
         Ellipse eyeL = new Ellipse(x - 20, y - 30, 12.5, 25.0);
         eyeL.setFill(Color.BLACK);
         Ellipse eyePupilL = new Ellipse(x - 20, y - 40, 7.5, 12.5);
         eyePupilL.setFill(Color.WHITE);
         Arc eyePupilSmallL = new Arc(x - 20 , y - 19, 7.5, 12.5, 180.0, 180.0);
         eyePupilSmallL.setFill(smallPupilGradient);

        // Right Eye
         Ellipse eyeR = new Ellipse(x + 20, y - 30, 12.5, 25.0);
         eyeR.setFill(Color.BLACK);
         Ellipse eyePupilR = new Ellipse(x + 20, y - 40, 7.5, 12.5);
         eyePupilR.setFill(Color.WHITE);
         Arc eyePupilSmallR = new Arc(x + 20 , y - 19, 7.5, 12.5, 180.0, 180.0);
         eyePupilSmallR.setFill(smallPupilGradient);

        // Mouth and Tongue (unchanging)
         Arc mouth = new Arc(100.0 * x/100, 112.5 - y/10, 20.0, 17.5, 180.0, 180.0);
         mouth.setFill(Color.rgb(116,30,30));
         Arc tongue = new Arc(100.0 * x/100, 113.75 - y/10, 17.5, 15.0, 180.0, 180.0);
         tongue.setFill(Color.rgb(200,72,73));

        group.getChildren().addAll(base, cheekL, cheekR, eyeL, eyePupilL
                , eyePupilSmallL, eyeR, eyePupilR, eyePupilSmallR, mouth, tongue);
    }

    private static LinearGradient getLinearGradient() {
        Stop[] colorChange = new Stop[] {
        new Stop(0, Color.BLACK),
        new Stop(1, Color.rgb(32,33,165)),
        new Stop(2, Color.rgb(45,113,209)),
        new Stop(3, Color.rgb(93,175,245)),
        new Stop(4, Color.rgb(78,75,163)),
        new Stop(5, Color.rgb(74, 54, 122)),
        new Stop(6, Color.BLACK) };
        return new LinearGradient( 0, 0, 0, 1, true, CycleMethod.NO_CYCLE, colorChange);
    }
}

