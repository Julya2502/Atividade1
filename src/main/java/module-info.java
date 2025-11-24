module com.example.atividade1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.atividade1 to javafx.fxml;
    exports com.example.atividade1;
}
