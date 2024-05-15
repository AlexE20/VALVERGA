module com.example.poolab {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.poolab to javafx.fxml;
    exports com.example.poolab;
}