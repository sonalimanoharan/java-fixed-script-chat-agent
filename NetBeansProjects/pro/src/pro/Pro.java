/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Sonal
 */
public class Pro extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Label profile =new Label("PROFILE ");
        Label name =new Label("NAME ");
        Label age =new Label("AGE ");
        Label gender =new Label("GENDER "); 
        Label about =new Label("ABOUT ");
        //Button profilebuton =new Button("UPLOAD");
        TextField namep=new TextField();  
        TextField agep=new TextField();
        TextField genderp=new TextField();
        TextField aboutp=new TextField(); 
        Button psubmit = new Button("DONE");
       
         
      GridPane gridPanel = new GridPane();  
      gridPanel.setMinSize(400, 200); 
      gridPanel.setPadding(new Insets(10, 10, 10, 10)); 
      gridPanel.setVgap(5); 
      gridPanel.setHgap(5);      
      gridPanel.setAlignment(Pos.CENTER);
     // gridPanel.add(profile, 0, 0);  
      //gridPanel.add(profilebuton, 0, 1);
      gridPanel.add(name, 1, 0); 
      gridPanel.add(namep, 1, 1);   
      gridPanel.add(age, 2, 0);
      gridPanel.add(agep,2, 1); 
      gridPanel.add(gender, 3, 0);   
      gridPanel.add(genderp, 3, 1);
      gridPanel.add(about,4,0 ); 
      gridPanel.add(aboutp, 4,1);
      gridPanel.add(psubmit, 1, 5); 
      
        psubmit.setOnAction(e->{
             try{
                 Class.forName("org.apache.derby.jdbc.ClientDriver");
                 Connection conp =DriverManager.getConnection("jdbc:derby://localhost:1527/signup","signup","signup");
                 PreparedStatement psp =conp.prepareStatement("insert into untitled(namep,agep,gender,about)values(?,?,?,?)");
                 psp.setString(1,name.getText());
                 psp.setInt(2,Integer.parseInt(agep.getText()));
                 psp.setString(3,genderp.getText());
                 psp.setString(4,aboutp.getText());
                 int ip = psp.executeUpdate();
                System.out.println("dsdsd");
                         
                 
             }
             catch(Exception e1){
                 System.out.println(e1);
                 
                System.out.println("EEEEE");
             }
             
        });


        Scene scene = new Scene(gridPanel, 300, 250);
        
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
