package com.example.atividade1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField txtNum1;

    @FXML
    private TextField txtNum2;

    @FXML
    private Label lblResultado;

    @FXML
    private Button btnSomar;

    @FXML
    private Button btnSubtrair;

    @FXML
    private Button btnMultiplicar;

    @FXML
    private Button btnDividir;

    @FXML
    public void initialize() {

        btnSomar.setOnAction(e -> {
            double n1 = Double.parseDouble(txtNum1.getText());
            double n2 = Double.parseDouble(txtNum2.getText());
            lblResultado.setText("Resultado: " + (n1 + n2));
        });

        btnSubtrair.setOnAction(e -> {
            double n1 = Double.parseDouble(txtNum1.getText());
            double n2 = Double.parseDouble(txtNum2.getText());
            lblResultado.setText("Resultado: " + (n1 - n2));
        });

        btnMultiplicar.setOnAction(e -> {
            double n1 = Double.parseDouble(txtNum1.getText());
            double n2 = Double.parseDouble(txtNum2.getText());
            lblResultado.setText("Resultado: " + (n1 * n2));
        });

        btnDividir.setOnAction(e -> {
            double n1 = Double.parseDouble(txtNum1.getText());
            double n2 = Double.parseDouble(txtNum2.getText());
            if (n2 == 0) {
                lblResultado.setText("Erro: Divisão por zero!");
            } else {
                lblResultado.setText("Resultado: " + (n1 / n2));
            }
        });
    }
}

