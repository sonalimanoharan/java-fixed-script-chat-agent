/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Sonal
 */
public class NewFXMain extends Application {
    String genderr=null;
    @Override
    public void start(Stage primaryStage) {
        Label profile =new Label("PROFILE ");
        Label name =new Label("NAME ");
        Label age =new Label("AGE ");
        Label gender =new Label("GENDER "); 
        Label about =new Label("ABOUT ");
        Button profilebuton =new Button("UPLOAD");
        TextField namep=new TextField();  
        TextField agep=new TextField();
        ToggleGroup group =new ToggleGroup(); 
        RadioButton female =new RadioButton("Female");
        RadioButton male = new RadioButton("Male");
        RadioButton others = new RadioButton("others");
        RadioButton no = new RadioButton("I rather not mention");
        female.setToggleGroup(group);
        male.setToggleGroup(group);
        others.setToggleGroup(group);
        no.setToggleGroup(group);
        TextField aboutp=new TextField();
        TextField passwordl1=new TextField();  
        Button pedit = new Button("DONE");
        
        

        female.setOnAction(f->{
                         genderr=female.getText();
                     
        });
        male.setOnAction(m->{
               genderr=male.getText();
        
                     
        });
        others.setOnAction(o->{
               genderr=others.getText();
        
        });
        no.setOnAction(n->{
               genderr=no.getText();
        
        });
         
         
         
         

        
        
        pedit.setOnAction(e->{
            
             try{
                 Class.forName("org.apache.derby.jdbc.ClientDriver");
                 Connection con =DriverManager.getConnection("jdbc:derby://localhost:1527/signup","signup","signup");
                 
                 PreparedStatement ps =con.prepareStatement("insert into untitled(name,age,gender,about)values(?,?,?,?)");
                 //ps.setString(1,namep.getText());
                 ps.setString(1,namep.getText());
                 ps.setInt(2,Integer.parseInt(agep.getText()));
                 if (female.isSelected()){
                          genderr=female.getText();
                     }
                if (others.isSelected()){
                       genderr=others.getText();
                }
                if (male.isSelected()){
                         genderr=male.getText();
                 }
                if (no.isSelected()){
                       genderr=no.getText();
                }
                 ps.setString(3,genderr);
                 ps.setString(4,aboutp.getText());
                 int i = ps.executeUpdate();
                
                         
                 
             }
             catch(Exception e1){
                 System.out.println(e1);
             }
        });
      
        
      GridPane gridPanel = new GridPane();  
      gridPanel.setMinSize(400, 200); 
      gridPanel.setPadding(new Insets(10, 10, 10, 10)); 
      gridPanel.setVgap(5); 
      gridPanel.setHgap(5);      
      gridPanel.setAlignment(Pos.CENTER);
      gridPanel.add(profile, 0, 0);  
      gridPanel.add(profilebuton, 0, 1);
      gridPanel.add(namep, 1, 0); 
      gridPanel.add(namep, 1, 1);   
      gridPanel.add(age, 2, 0);
      gridPanel.add(agep,2, 1); 
      gridPanel.add(gender, 3, 0);  
      gridPanel.add(female, 3,1);
      gridPanel.add(male,3,2); 
      gridPanel.add(others, 3,4);   
      gridPanel.add(no,3,5);
      gridPanel.add(about,4,0 ); 
      gridPanel.add(aboutp, 4,1);
      gridPanel.add(pedit, 1, 5); 


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
