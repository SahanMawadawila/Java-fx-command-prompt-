module com.example.assignment6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assignment6 to javafx.fxml;
    exports com.example.assignment6;
}