/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication6;




import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import static java.sql.DriverManager.println;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Sonal
 */
public class JavaFXApplication6 extends Application {
    
   


    PreparedStatement ps;
    Connection conn;
    ResultSet rs;
     
    public static void main(String[]args)
    {
        Application.launch(args);
    }
    @Override
    public void start(Stage primaryStage)
    { Button btnd = new Button("DELECT");
    Label dele= new Label("ENTER USERNAME TO DELECT");
       TextField ti= new TextField(); 
       GridPane gg= new GridPane();
       gg.add(ti,0,0);
       gg.add(btnd,0,1);
        btnd.setOnAction(e->{
            
            
        
        
        try{
            
                 Class.forName("org.apache.derby.jdbc.ClientDriver");
                 Connection con2d =DriverManager.getConnection("jdbc:derby://localhost:1527/signup","signup","signup");
                 PreparedStatement ps2d=con2d.prepareStatement("delete from signup where uname=? ");
                 //message.appendText(ii);
                 
                 
                 ps2d.setString(1,(ti.getText()));
                  ps2d.executeUpdate();
                 //String newLine = System.getProperty("line.separator");
                 //Text.appendText("\n")
                 
           System.out.println("done22");
             }
        catch(Exception e2){
                 System.out.println(e2);
                 
           System.out.println("done2");
             }
       
        });
        primaryStage.setTitle("Photo From Database To Scene");
        Scene scenen = new Scene(gg,250,300);
        primaryStage.setScene(scenen);
        primaryStage.show();
    }

}