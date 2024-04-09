module com.example.configuratoreautoonline {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.configuratoreautoonline to javafx.fxml;
    exports com.example.configuratoreautoonline;
}