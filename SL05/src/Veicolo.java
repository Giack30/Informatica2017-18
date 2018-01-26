/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Administrator
 */
public class Veicolo extends Application{
    
    public Stage primaryStage;
    public BorderPane rootLayoutGPS;
    public AnchorPane GPSscreen;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        launch(args);
       
    }
    
        public Stage getPrimaryStage() {
        return primaryStage;
    }
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Socket");
        initpageGPS();
        //showGPSscreen();
    }
    
    public void initpageGPS() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Veicolo.class.getResource("view/GPSscreen.fxml"));
            GPSscreen = (AnchorPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(GPSscreen);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
