module com.nur.marketresearch {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.nur.marketresearch to javafx.fxml;
    exports com.nur.marketresearch;
}