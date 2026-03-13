package ranks.gym;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GymMenu {

    @FXML
    private Button btnProcess;

    @FXML
    private Label lblFee;

    @FXML
    private Label lblFee1;

    @FXML
    private Label lblID;

    @FXML
    private Label lblName;

    @FXML
    private TextField txtFee;

    @FXML
    private TextField txtID;

    @FXML
    private TextField txtMonths;

    @FXML
    private TextField txtName;

    @FXML
    void calcPayment(ActionEvent event) {
        int fee = Integer.parseInt(txtFee.getText());
        int months = Integer.parseInt(txtMonths.getText());
        int result = fee*months;

    }
    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
    @FXML
    void checkField(ActionEvent event) {
        if(txtFee.getText().isEmpty()){
            alert.setContentText("Error.");
        }
        if(txtID.getText().isEmpty()){
            alert.setContentText("Error.");
        }
        if(txtMonths.getText().isEmpty()){
            alert.setContentText("Error.");
        }
        if(txtName.getText().isEmpty()){
            alert.setContentText("Error.");
        }
    }


}
