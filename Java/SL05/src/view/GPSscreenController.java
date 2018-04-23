/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import code.localizzatore;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
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
	@FXML
	public Button startB;
	@FXML
	public Button stopB;
	
	public Thread t;
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
		String name= nameField.getText().toString();
		int tempo= ((int)time.getValue())*1000;
		t = new Thread(new localizzatore(name, tempo));
		t.start();
		startB.setDisable(true);
		stopB.setDisable(false);
    }
	public void handleStop(){
		t.interrupt();
		t.stop();
		startB.setDisable(false);
		stopB.setDisable(true);
	}
    
}

