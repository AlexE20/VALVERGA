package com.example.poolab;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class CafeteriaController {
    @FXML
    private Label txtTotal;

    @FXML
    private Button comprar;

    @FXML
    private Label txtSubtotalLasagna;

    @FXML
    private Label txtSubtotalRes;

    @FXML
    private Label txtSubtotalAlitas;

    @FXML
    private Label txtSubtotalVegetales;



    @FXML
    private RadioButton RBEmpleado;

    @FXML
    private RadioButton RBEstudiante;

    @FXML
    private RadioButton RBEfectivo;

    @FXML
    private RadioButton RBTarjeta;

    @FXML
    private TextField txtNombre;
    @FXML
    private Button Limpiar;
    @FXML
    private Spinner<Integer> CantidadLas;
    @FXML
    private Spinner<Integer> CantidadRe;
    @FXML
    private Spinner<Integer> CantidadAl;
    @FXML
    private Spinner<Integer> CantidadVeg;

    @FXML
    private Button Comprar;

private double precioLasagna= 3.50;
private double precioRes= 3.25;
private double precioAlitas=4.25;
private double precioVegetales=3.25;

    private Double total;
    private double subtotal;

    Double sub;

    @FXML
    public void initialize(){
        CantidadLas.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10, 0));
        CantidadLas.valueProperty().addListener((observable, oldValue, newValue) -> {
            double cant = Double.parseDouble(newValue.toString());
            Double sub = cant*precioLasagna;
            txtSubtotalLasagna.setText(sub.toString());
            updateTotalLabel();

        });
        CantidadRe.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10, 0));
        CantidadRe.valueProperty().addListener((observable, oldValue, newValue) -> {
            double cant = Double.parseDouble(newValue.toString());
            Double sub = cant*precioRes;
            txtSubtotalRes.setText(sub.toString());
            updateTotalLabel();

        });
        CantidadAl.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10, 0));
        CantidadAl.valueProperty().addListener((observable, oldValue, newValue) -> {
            double cant = Double.parseDouble(newValue.toString());
            Double sub = cant*precioAlitas;
            txtSubtotalAlitas.setText(sub.toString());
            updateTotalLabel();

        });
        CantidadVeg.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10, 0));
        CantidadVeg.valueProperty().addListener((observable, oldValue, newValue) -> {
            double cant = Double.parseDouble(newValue.toString());
            Double sub = cant*precioVegetales;
            txtSubtotalVegetales.setText(sub.toString());
            updateTotalLabel();

        });


    }



@FXML
    private double setTotal(){
    double lasagnaSubtotal = Double.parseDouble(txtSubtotalLasagna.getText());
    double ribsSubtotal = Double.parseDouble(txtSubtotalRes.getText());
    double wingsSubtotal = Double.parseDouble(txtSubtotalAlitas.getText());
    double vegetablesSubtotal = Double.parseDouble(txtSubtotalVegetales.getText());
    double total=lasagnaSubtotal+ribsSubtotal+vegetablesSubtotal+wingsSubtotal;

    return total;

}



    @FXML
    public void updateTotalLabel() {
        double totalPrice = setTotal();
        txtTotal.setText("Total: " + totalPrice);
    }


    private Double obtenerDescuento(double total){
        if (RBEmpleado.isSelected()){

        }
        return total;
    }



}