/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.checkout;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author vuaphapthuat410
 */
public class ConfirmOrderController implements Initializable {

    @FXML
    private Button btBack;
    @FXML
    private Button btSubmit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void toBack(ActionEvent event) {
        Stage stage = (Stage) btBack.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void submit(ActionEvent event) {
    }
    
}
