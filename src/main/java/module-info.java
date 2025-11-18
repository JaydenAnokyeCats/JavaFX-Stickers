module com.example.javafxstickers {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxstickers to javafx.fxml;
    exports com.example.javafxstickers;
}