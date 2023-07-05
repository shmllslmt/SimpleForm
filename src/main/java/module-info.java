module com.shamilla.simpleform {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.shamilla.simpleform to javafx.fxml;
    exports com.shamilla.simpleform;
}