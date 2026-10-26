module com.mycompany.lab09_fall {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.lab09_fall to javafx.fxml;
    exports com.mycompany.lab09_fall;
}
