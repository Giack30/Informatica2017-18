/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.makery.address.view;

import ch.makery.address.localizzatore;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class GPSscreenController implements Initializable {
    @FXML
    public TextField nameField;
    @FXML
    public Slider time;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    public void handleExit(){
        Alert alert= new Alert(AlertType.CONFIRMATION);
        alert.setTitle("are u sure to exit??");
        alert.setContentText("please confirm !!");
        alert.showAndWait();
        
        if(alert.getResult()==ButtonType.OK){
            System.exit(0); 
        }else{System.out.println("operazione annullata");       
    }
    }
        
    public void handleStart() throws InterruptedException{
        String name=nameField.getText().toString();
        localizzatore l=new localizzatore(name);
        int tempo=(int) time.getValue();
        tempo=Integer.parseInt((tempo+"000"));
        
        while(true){             //ciclo infinito con pause tra i dati
       Thread.sleep(tempo);
        System.out.println(l.getInfo());
       }
    }
    
}

