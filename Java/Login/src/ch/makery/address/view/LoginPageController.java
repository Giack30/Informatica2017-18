/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.makery.address.view;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class LoginPageController{

    @FXML
    private TextField userName;
    @FXML
    private PasswordField passwordField; 
    
    
    @FXML
    public void handleLogin() {
        System.out.println("hai provato a loggare");
        String person=userName.getText().toString();
        String password=passwordField.getText().toString();
        System.out.println("u tried to log in with :"+person);
        System.out.println("if u don't remember your password is: "+password);
    }
    
}
