module com.example.apcsproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.apcsproject to javafx.fxml;
    exports com.example.apcsproject;
}