/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DreamsCenter;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.RequiredFieldValidator;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author MustafaSaad
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private JFXTextField Txtuser;
   
    @FXML
    private JFXTextField Pfield;
    
   
    
    public void handleButtonSignUp(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(OurProject.class.getResource("FXMLSignUp.fxml"));
       
        
        
        Scene scene = new Scene(root);
        Image img =new Image("DreamsCenter/Images/cc.png");
       stage.getIcons().add(img);
        stage.setTitle("Sign Up");
        stage.setScene(scene);
        stage.show();
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        RequiredFieldValidator validator = new RequiredFieldValidator();
        Txtuser.getValidators().add(validator);
        validator.setMessage("UserName Is Empty!!..");
        //Txtuser.setFont(Font.font("Tahoma", FontWeight.EXTRA_LIGHT, 20));
        
        Txtuser.focusedProperty().addListener((ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) -> {
            if (!newValue) {
                Txtuser.validate();
            }
        });
        
    }    
    
}
