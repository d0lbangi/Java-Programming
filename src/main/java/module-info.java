module com.example.BasicMath {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.BasicMath to javafx.fxml;
    exports com.example.BasicMath;
}