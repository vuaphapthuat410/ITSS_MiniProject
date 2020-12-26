/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.dashboard.products;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author vuaphapthuat410
 */
public class ProductController implements Initializable {

    @FXML
    private RadioButton rbEbook;
    @FXML
    private RadioButton rbAlbum;
    @FXML
    private RadioButton rbFilm;
    @FXML
    private RadioButton rbBook;
    @FXML
    private RadioButton rbLP;
    @FXML
    private RadioButton rbCD;
    @FXML
    private RadioButton rbDVD;
    @FXML
    private Button btCancel;
    @FXML
    private Button btNext;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void toCancel(ActionEvent event) {
        Stage currrentStage = (Stage) btCancel.getScene().getWindow();
        currrentStage.close();
    }

    @FXML
    private void toNext(ActionEvent event) throws IOException {
        int count = 0;
        String file_path = new String();
        
        boolean isBook = rbEbook.isSelected();
        boolean isCD = rbCD.isSelected();
        boolean isDVD = rbDVD.isSelected();
        boolean isLP = rbLP.isSelected();
        boolean isEbook = rbEbook.isSelected();
        boolean isAlbum = rbAlbum.isSelected();
        boolean isFilm = rbFilm.isSelected();
        
        ArrayList<Boolean> isChoosed = new ArrayList<Boolean>();
        isChoosed.add(isBook);
        isChoosed.add(isCD);
        isChoosed.add(isDVD);
        isChoosed.add(isLP);
        isChoosed.add(isEbook);
        isChoosed.add(isAlbum);
        isChoosed.add(isFilm);
        
        for (boolean isTicked : isChoosed) {
            if(isTicked == true) count++;
        }
        
        if(count != 1) {
            Alert statusAlert = new Alert(Alert.AlertType.ERROR);
            statusAlert.setTitle("Error occues");

            statusAlert.setHeaderText("Choose products");
            statusAlert.setContentText("Choose only one product at one time.");

            statusAlert.showAndWait();
            return;
        }
        else {
            if(isBook == true)
                file_path = "views/dashboard/products/book.fxml";
            else if(isCD == true)
                file_path = "views/dashboard/products/CD.fxml";
            else if(isDVD == true)
                file_path = "views/dashboard/products/DVD.fxml";
            else if(isLP == true)
                file_path = "views/dashboard/products/LP.fxml";
            else if(isEbook == true)
                file_path = "views/dashboard/products/ebook.fxml";
            else if(isAlbum == true)
                file_path = "views/dashboard/products/album.fxml";
            else if(isFilm == true)
                file_path = "views/dashboard/products/film.fxml";
            
            Parent node = FXMLLoader.load(getClass().getClassLoader().getResource(file_path));
            Stage stage = new Stage();
            stage.setTitle("Add product");
            stage.setScene(new Scene(node));
            stage.show();
            
            //Close this screen
            ((Stage)(((Node)(event.getSource())).getScene().getWindow())).close();
        }
        
    }
    
}
