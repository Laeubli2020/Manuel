module bztf.ch {
    requires javafx.controls;
    requires javafx.fxml;

    opens bztf.ch to javafx.fxml;
    exports bztf.ch;
}