module com.mycompany.holamundo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.holamundo to javafx.fxml;
    exports com.mycompany.holamundo;
}
